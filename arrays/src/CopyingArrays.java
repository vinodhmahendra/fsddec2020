import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {

		// original array; (source)
		int[] myArray = { 1, 2, 3, 4, 5, 6 };

		// new larger array (destination)
		int[] hold = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		// System.out.println(myArray);
		System.out.println("myArray holds :" + Arrays.toString(myArray));
		System.out.println("hold values :" + Arrays.toString(hold));
		// copy all of the myArray array to the hold array ,starting with the 0th index
		System.arraycopy(myArray, 0, hold, 0, myArray.length);

		System.out.println("hold values :" + Arrays.toString(hold));
	}

}
