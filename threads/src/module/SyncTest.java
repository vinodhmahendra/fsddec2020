package module;

public class SyncTest {

	public static void main(String[] args) {
		// create an object of Stack
		Stack stack = new Stack();
		
		Producer p1 = new Producer(stack);
		Thread t1 = new Thread(p1);
		t1.start();

	
		Consumer c1 = new Consumer(stack);
		Thread t2 = new Thread(c1);
		t2.start();
	
	
	}

}
