
public class HelloRunner implements java.lang.Runnable {

	// class variable (static variable)
	public static int counter = 0;

	// define a constructor
	public HelloRunner() {

	}

	@Override
	public void run() {
		
		while(HelloRunner.counter <= 10) {
			try {
				System.out.println("Expl Thread : " +(++HelloRunner.counter));
				//invoke a sleep method
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				System.out.println("Exception in thread : " +e.getMessage());			}
		}

	}
	
	public static void main(String[] args) {
		System.out.println("starting main() thread.....");
		HelloRunner target = new HelloRunner();
		//create an object of Thread class
		Thread t = new Thread(target);
		t.start();
	}

}
