public class Book
{
    // instance variables - replace the example below with your own
    private String isbn; 
    private LibraryMember library_member;
    private String book_damages;
    private String title;
    private String author;

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
    isbn = "";
    library_member = null;
    book_damages = "";
    title = "";
    author = "";
    }
    
    public String get_isbn()
    {
        return isbn;
    }
    
    public LibraryMember get_library_member()
    {
        return library_member;
    }
  
    public String get_book_damages()
    {
        return book_damages;
    }
    
    public String get_title()
    {
        return title;
    }
    
    public String get_author()
    {
        return author;
    }
    
    public void isbn(String newIsbn)
    {
        isbn = newIsbn;
    }
    
    public void setTitle(String newTitle)
    {
        title= newTitle;
    }
    
    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }
    
    public void setLibraryMember(LibraryMember newLibraryMember)
    {
        library_member = newLibraryMember;
    }
    
    public void setBookDamages(String newBookDamages)
    {
        book_damages = newBookDamages;
    }
    
    public boolean checkAvailability()
    {
        if(library_member == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void print_details()
    {
        System.out.println(author);
    }
}  
    
    