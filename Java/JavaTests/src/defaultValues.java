
// when you do not assign an instance variable, the values are default

// integers = 0
// boolean = false
// reference = null

public class defaultValues {
	
	// constructors SET THE VALUES
	public defaultValues(int size) {
		this.size = size;
	}
	
	// OR left as default
	private int size;
	private String name;
	private String bread;
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBread() {
		return bread;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	
// testing 
	public static void main (String[] args) {
		
		//setting the default value of size, leaving the rest as default
		defaultValues one = new defaultValues(5);
		
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog size is " + one.getName());
		System.out.println("Dog bread is " + one.getBread());
	}
}
