package module;

public class Producer implements Runnable{
	
	private Stack theStack; 
	private int num;
	private static int counter =1;
	
	public Producer(Stack s) {
		theStack =s;
		num = counter++;
	}
	

	@Override
	public void run() {
		char c;
		for (int i = 0; i < 200; i++) {
			c = (char)(Math.random()*26+'A');
			theStack.push(c);
			System.out.println("Producer" + num + ": "+c);
			try {
				Thread.sleep((int)(Math.random() * 300));
			}catch(InterruptedException e) {
				
			}
		}
	}
}
