
public class TestOuter {
	
//	private  int data = 100; non static memebers can't access in static nested class
	private static int data = 100;
	
	//define static inner class
	static class Inner {
		void display() {
			System.out.println("data is : "  + data);
		}
	}
	
	public static void main(String[] args) {
		TestOuter.Inner object  = new TestOuter.Inner();
		object.display();
	}

}
