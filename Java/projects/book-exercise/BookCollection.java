import java.util.ArrayList;

/**
 * Stores Book objects in a book collection.
 * 
 * @author Kostas
 * @version April 2016
 */

public class BookCollection
{    
    //Declare an ArrayList to store the Book objects.
    private ArrayList<Book> books; //other good names for the list: bookList, bookCollection etc.
    
   /**
     * Constructor for objects of class BookCollection
     */
    public BookCollection()
    {
        // Create an ArrayList to store the Book objects.
        books = new ArrayList<Book>();
    }

   /**
     * Adds a new Book to the collection of books.
     * @param book The Book object to be added.
     */
    public void addBook(Book book)
    {
        books.add(book);
    }
    
    /**
     * Prints the details of all Book objects stored in the books ArrayList, or  
     * "This collection is empty!" if the ArrayList is empty.
     * (uses a for-each loop)
     */
   public void listBooksDetails1()
    {
        // It checks is the ArrayList is empty.
        if (books.size() == 0) {
            System.out.println("This collection is empty!");
        }
        else {
            System.out.println("This collection contains " + books.size() + " books:");
      
            for(Book book: books){
                book.printDetails();
            }
        }
   }

   /**
     * Prints the details of all Book objects stored in the books ArrayList, or  
     * "This collection is empty!" if the ArrayList is empty.
     * (uses a while loop)
     */
   public void listBooksDetails2()
    {
         // It checks is the ArrayList is empty.
         if (books.size() == 0) {
                System.out.println("This collection is empty!");
            }
            else {
                System.out.println("This collection contains " + books.size() + " books:");
          
                int index = 0;
                while(index < books.size()){
                    Book book = books.get(index);
                    book.printDetails();
                    index++;
                }
            }
    }
    
   /**
     * @return The number of books (Book objects) in
     *         the collection.
     */
   public int numberOfBooks()
    {
        return books.size();
    }
   
   /**
     * Prints the details of all Book objects that EITHER their title 
     * OR their author's name start with the searchString parameter.
     * (Uses the startsWith() method from the Java String class)
     * 
     * @param searchString The string to search        
     */
    // starts with search, added, trim to size, change to lower case
   public void searchCollection(String searchString)
   {
       for (Book book: books){
            if (book.getTitle().startsWith(searchString)||book.getAuthor().startsWith(searchString))
            books.trimToSize(); 
            book.printDetails();
            System.out.println(searchString.toLowerCase());
        }
   }
   // ends with search
   public void searchCollectionENDWITH(String searchString)
   {
       for (Book book: books){
            if (book.getTitle().endsWith(searchString)||book.getAuthor().endsWith(searchString))
            books.trimToSize(); 
            book.printDetails();
            System.out.println(searchString.toLowerCase());
        }
   }
   
   // contains, instead of ends with
   public void searchCollectionCONTAINS(String searchString)
   {
       for (Book book: books){
            if (book.getTitle().contains(searchString)||book.getAuthor().contains(searchString))
            books.trimToSize(); 
            book.printDetails();
            System.out.println(searchString.toLowerCase());
        }
   }
   
   
}