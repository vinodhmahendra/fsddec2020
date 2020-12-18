
public class ThrowsDemo {

	void division() throws ArithmeticException {
		int a = 45;
		int b = 0;
		int result = a / b;
		System.out.println("\n\t The result is  : " + result);
	}

	public static void main(String[] args) {
		ThrowsDemo object = new ThrowsDemo();
		try {
			object.division();
		} catch (ArithmeticException e) {
			System.out.println("\n\t Error :" + e.getMessage());
		}
		System.out.println("\n\t End of program.");
	}
}
