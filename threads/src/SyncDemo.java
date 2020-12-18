
public class SyncDemo {

	public static void main(String[] args) {
	
		//create an object of Sender
		Sender sharedObject = new Sender();
		
		SenderThread t1 = new SenderThread("Hi", sharedObject);
		SenderThread t2 = new SenderThread("Bye", sharedObject);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
				

	}

}
