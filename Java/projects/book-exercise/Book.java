/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author K. Liaskos
 * @version February 2016
 */
public class Book
{
    // Store this book's author.
    private String author;
    // Stores this book's title.
    private String title;
    // Stores this book's number of pages. 
    private int noOfPages;
    // Stores this book's reference number. 
    private String refNumber;
    //Stores the number of copies in stock.
    private int noOfCopies;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        noOfPages = bookPages; 
        refNumber = ""; 
        noOfCopies = 0;
    }
    
    
    /**
     * Returns the author of this book.
    */
    public String getAuthor() 
    {   
        return author;
    }

    
    /**
     * Returns the title of this book.
     */
    public String getTitle()
    {
        return title;
    }
    
    
    /**
     * Returns the number of pages in this book.
     */
    public int getNoOfPages() 
    {
        return noOfPages;
    }
    
    
    /**
     * Returns the reference number for this book.
     */
    public String getRefNumber() 
    {   
        return refNumber;
    }

    
    /**
     * Returns the number of copies.
     */
    public int getNoOfCopies() 
    {
        return noOfCopies;
    }

   
    /**
     * Prints the name of the author in the terminal window.
     */
    public void printAuthor() 
    {   
        System.out.println("Author: " + author);
    }
    
    
    /**
     * Prints the title of the book in the terminal window.
     */
    public void printTitle() 
    {
        System.out.println("Title: " + title);
    }

   
    /**
     * Prints the details of the book in the terminal window.
     */
    public void printDetails() 
    {
        System.out.println("Title:  " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages:  " + noOfPages);
    
        
        String refNumberString;
        if(refNumber.length() > 0 ) {
            refNumberString = refNumber;
        }
        else {
            refNumberString = "Ref. No. Not Set";
        }
        System.out.println("Reference number:  " + refNumberString);
        
        System.out.println("No. of copies in stock: " + noOfCopies);
    }

    
    /**
     * Sets the reference number for this book.
     * Allows only ref numbers that are at least 3 characters long.
     */
    public void setRefNumber(String ref) 
    {
        if(ref.length() >= 3) {
            refNumber = ref; 
        }
        else {
            System.out.println("Error! The reference number must be at least 3 characters long.");
        }
    }

    
    /**
     * Simulates buying a book copy. 
     * Increments the number of copies by 1.
     */
    public void buyCopy() 
    {
        noOfCopies++;
    }

    
}
