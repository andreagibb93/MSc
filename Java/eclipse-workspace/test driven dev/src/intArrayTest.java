import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intArrayTest {

	@Test
	void test() {
		intArray this myIntArray = new intArray;
		int input1 = 1;
		Boolean added1 = myIntArray.add(input1);
		assertEquals(true, added1);
		
	}

}
