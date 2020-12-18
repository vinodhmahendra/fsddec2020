
public class MyClass {

	public static void main(String[] args) {

		int[] array = new int[3];
		// handle rule
		try {
			array[7] = 30;
		} catch (ArrayIndexOutOfBoundsException e) { // Exception Handlers
			System.out.println("Array index is out of bounds");
		} finally {
			System.out.println("The array is of size " + array.length);
		}

	}

}
