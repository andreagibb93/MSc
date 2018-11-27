
public class Test {

	
	
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayStack a = new ArrayStack(50);
		ArrayStack b = new ArrayStack();
		
		//System.out.println("" +("" + a.size(), "" + a.top(), "" + a.isEmpty()));
		System.out.println("" + a.size());
		System.out.println("" + b.size());
		
		System.out.println("" + a.isEmpty());
		System.out.println("" + b.isEmpty());
		
		a.push(2);
		a.push(4);
		b.push(123);
		b.push(321);
		
		
		System.out.println("" + a.isEmpty());
		System.out.println("" + b.isEmpty());
		
		System.out.println("" + a.size());
		System.out.println("" + b.size());
		
		System.out.println("" + a.top());
		System.out.println("" + b.top());

		a.pop();
		b.pop();
		
		System.out.println("" + a.size());
		System.out.println("" + b.size());
		
		System.out.println("" + a.top());
		System.out.println("" + b.top());
		
	}

}
