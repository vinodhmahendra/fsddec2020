
public class SenderThread extends java.lang.Thread {

	private String message;
	private Thread t;
	private Sender sender;

	public SenderThread(String message, Sender sender) {
		this.message = message;
		this.sender = sender;
	}

	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
	}
}
