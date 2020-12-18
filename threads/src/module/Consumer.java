package module;

public class Consumer implements Runnable{

	private Stack theStack;
	private int num;
	private static int counter =1;
	
	public Consumer(Stack s) {
		theStack = s;
		num = counter++;
	}
	
	@Override
	public void run() {
		char  c;
		for (int i = 0; i < 200; i++) {
			c = theStack.pop();
			System.out.println("Consumer " + num + ": "+c);
			
			try {
				Thread.sleep((int)(Math.random()*300));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
