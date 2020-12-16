
public class CallMethod {
	
	private int value;

	public static void main(String[] args) {
		CallMethod callMethod = new CallMethod();
		System.out.println("before operation value of data is " +callMethod.value);
		
		callMethod.operation(100);
		
		
		System.out.println("after operation value of data is " +callMethod.value);
	}

	private int operation(int value) {
		this.value = value * 10 / 100;
		return value;
	}

}
