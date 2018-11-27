
/**
 * Write a description of class LibraryMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class LibraryMember
{
    // instance variables - replace the example below with your own
    private String name;
    private String user_id;
    private ArrayList <Book> book;
    private String messages;

    /**
     * Constructor for objects of class LibraryMember
     */
    
    public LibraryMember(String messages)
    { // initialise instance variables
        name = "";
        user_id = "";
        book = new ArrayList<Book>();
        this.messages = messages;   
    }
    
    public String get_name()
    {
        return name;
    }
    
    public String get_user_id()
    {
        return user_id;
    }
    
    public String get_messages()
    {
        return messages;
    }
    
    public void set_name(String new_name)
    {
        name = new_name;
    }
    
    public void set_user_id(String new_user_id)
    {
        user_id = new_user_id;
    }
    
    public void set_messages(String new_messages)
    {
        messages += new_messages;
    }
    
    public void add_book(Book new_book)
    {
        book.add(new_book);
    }
    
    public void print_books()
    {
        for (Book b : book)
        {
            System.out.println(b.print_details());
        }
    }
    
    public void get_number_borrowed()
    {
        System.out.println(book.size());
    }
}