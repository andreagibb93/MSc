
public class codeMagnets {
	public static void main(String [] args) {
		
		
		int x = 3;
		
		
		if (x > 2) {
			 System.out.print("a");
			 // int still 3
			 
				while (x > 0) {
					x = x - 1;
					// int now 2 
						System.out.print("-");
						
							if (x == 2) {
								System.out.print("b c");
								
							}
							// close while loop
							
									if (x == 1) {
										System.out.print("d");
											x = x - 1;
											// int now 1
								   
							}
						}
				}
		}
	}
