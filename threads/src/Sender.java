
// shared object
public class Sender {
	
	public void send (String message) {
		System.out.println("Sending\t" +message);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n" + message +" Sent");
	}

}
