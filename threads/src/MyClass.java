
public class MyClass {
	
	//create a static variable by name LOCK
	private static Object LOCK = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(4000);
		
		System.out.println("Thread " + Thread.currentThread().getName() + "is woken after sleeping for 4 seconds");
		
		// wait() needs synchronized block
		synchronized (LOCK) {
			LOCK.wait(2000);
			System.out.println("Object " + LOCK + " is woken after waiting for 2 second.");
		}
	}

}
