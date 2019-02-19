import org.junit.jupiter.api.Test;

class RandomQueueTest {

	@Test
	void testSize() {
		RandomQueue q = new StaticRandomQueue(10);
		assert(q.size() == 1);
	}
	
	@Test
	void testAdd() {
		RandomQueue q = new StaticRandomQueue(10);
		q.add("oneThing");
		assert(q.size() == 1);
		
		
	}
	
	@Test
	void testRemove() {
		RandomQueue q = new StaticRandomQueue(1);
		assert(q.remove());
	}


}
