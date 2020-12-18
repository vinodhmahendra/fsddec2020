package module;

import java.util.ArrayList;
import java.util.List;

//shared object 
public class Stack {
	
	private List<Character> buffer = new ArrayList<>(400);
	
	public synchronized char pop() {
		char c;
		while(buffer.size() == 0) {
			try {
				this.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		c = buffer.remove(buffer.size()-1);
		return c;
	}
	
	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
		
	}

}
