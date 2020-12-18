
public class ThrowDemo {

	public static void main(String[] args) {
		int a = 45 , b = 0 , result;
		
		try {
			if ( b == 0)
				throw new ArithmeticException("can't divide by zero");
			else {
				result = a / b;
				System.out.println("\n\t The result is : " + result);
			}
		}catch(ArithmeticException e) {
			System.out.println("\n\t Error : " +e.getMessage());
		}
		System.out.println("\n\t End of program.");
	}

}
