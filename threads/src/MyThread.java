
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("concurrent thread started running ...");
	}
	
	public static void main(String[] args) {
		//create an object of MyThread
		Thread mythread = new MyThread();
		
		//call a start() to invoke a  run()
		mythread.start();
		
//		mythread.run(); do not invoke a run()
	}

}
