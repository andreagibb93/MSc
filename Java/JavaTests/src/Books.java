
public class Books {

	String title; 
	String author;
	}

	class BooksTestDrive {
	public static void main(String [] args) {
	
		// create the fixed array called myBooks
		Books [] myBooks = new Books[3];
	
		//start at position 0 of the fixed array
		int x = 0;
		
		// need to actually make the objects
		myBooks [0] = new Books();
		myBooks [1] = new Books();
		myBooks [2] = new Books();
		
		// assign the titles
		myBooks[0].title = "The Grapes of Java"; 
		myBooks[1].title = "The Java Gatsby"; 
		myBooks[2].title = "The Java Cookbook"; 
		
		// assign authors
		myBooks[0].author = "bob"; 
		myBooks[1].author = "sue"; 
		myBooks[2].author = "ian";
	
		// while loop, loops 3 times 
		while (x < 3) { 
			System.out.print(myBooks[x].title); 
			System.out.print(" by "); 
			System.out.println(myBooks[x].author); 
			x = x + 1;
	
				}
			} 
		}

