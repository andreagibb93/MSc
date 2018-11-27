/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = true;
    }

    // Add the methods here ...
    public String getPrintAuthor()
    {
        return author;
    }
    
    public String getPrintTitle()
    {
        return title;
    }

    public int getPages()
    {
        return pages;
    }
    
    public int getBorrowed()
    {
        return borrowed; 
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public boolean getisCourseText()
    {
        return courseText;
    }
    
    public void printDetails()
    {
      System.out.println("Author: " + author);
      System.out.println("Title: " + title);
      System.out.println("pages: " + pages);
      System.out.println("reNo: " + refNumber);
      System.out.println("Borrowed: " + borrowed);
      if(refNumber.length() <= 0){
        System.out.println("ZZZ");
        }
      else {
          System.out.println(refNumber);
        }
      
    }
    
    public String setRefNumber()
    {
        return refNumber;
    }
    
    public void setrefNumber(String ref){
        if(refNumber.length() < 3){
            System.out.println("error");
        }
        else{
            refNumber = ref;
        }
    }
    
    public void setBorrowed()
    {
         borrowed ++;
    }
}
