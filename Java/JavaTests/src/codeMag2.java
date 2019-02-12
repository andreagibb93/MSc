
public class codeMag2 {
	
	public static void main (String [] args) {
		
		// create arrays
		int [] index = new int[4];
		String [] islands = new String[4];
		
		int y = 0;
		
		// create index objects
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		// create island objects
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		
		int ref;
		while (y < 4) {
			ref = index[y];
			System.out.print("island = ");
			System.out.println(islands[ref]);
			y = y + 1;
			
		}
		
		
	}

}
