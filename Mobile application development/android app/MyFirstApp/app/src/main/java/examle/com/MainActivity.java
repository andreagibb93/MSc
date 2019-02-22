package examle.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "examle.com.myfirstapp.MESSAGE";
    private BookDatabase books;
    private int searchTypeCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create new book database, add some books
        books = new BookDatabase();
        books.addBook(new Book("andi", "Book"));
        books.addBook(new Book("andi", "Book2"));
        books.addBook(new Book("stephen king", "meltos"));
        books.addBook(new Book("stephen ping", "meltos"));
    }

    //adds a new book to the collections when user presses 'send button'
    // takes the book info from the text inputs
    public void sendMessage(View view) {
        // takes the text from id
      EditText editText1 = findViewById(R.id.editText1);
      EditText editText2 = findViewById(R.id.editText2);
      // passes the text into a string called 'message'
      String message1 = editText1.getText().toString();
      String message2 = editText2.getText().toString();
      //adds the new book with both messsages
      books.addBook(new Book(message1, message2));
      // clears the edit text input box after adding the books
      editText1.getText().clear();
      editText2.getText().clear();

    }
    //Searches for books by whatever is in text box when the search button is pressed
    //and dependant on the radio button pressed. Lists the results in the text view
    public void searchBooks(View view) {
        ArrayList<Book> bookList = new ArrayList<>();
        TextView textView1 = findViewById(R.id.textView2));
        EditText editText1 = findViewById(R.id.editText3);
        // radio buttons
        RadioButton titleSearch = findViewById(R.id.radio_title);
        RadioButton authorSearch = findViewById(R.id.radio_author);
        // get message1 pass as string
        String message1 = editText1.getText().toString();
        String result = "";
        if(searchTypeCheck == 0){
            bookList = books.searchByTitle(message1);
        }
        else if (searchTypeCheck == 1){
            bookList = books.searchByAuthor(message1)
        }
        else{
            // toast error here
        }
        if(bookList.size() > 0){
            int count = 1;
            for (int i = 0; i < bookList.size(); i++) {
                result = result + count + ". " + "Author" + bookList.get(i).getAuthor() + "\n" + "Title" + bookList.get(i).getTitle() + "\n";
                count++;
            }
            textView1.setText(result);
        }
        else {
            textView1.setText(R.string.search_rejection);
        } // clear the text box after search
        editText1.getText().clear();
    }

    //Monitors when radio buttons are clicked and sets an integer flag determining which search is used.
    //This is an integer right now in case more searches need to be added but anything could be
    //done with the radio buttons. There might be a much better way of doing this.
    public void onRadioButtonClicked(View view) {
        // is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which button was clicked
        switch(view.getId()) {
            case R.id.radio_title;
            if(checked)
                searchTypeCheck = 0;
            break;
            case R.id.radio_author;
            if(checked)
                searchTypeCheck = 1;
            break;
        }
    }



}
