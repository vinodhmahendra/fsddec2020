
public class PassTest {

	//method to change the current value
	public static void changeInt(int value) {
		value = 55;
	}
	
	public static void main(String[] args) {
		int value;
		// assign the int(11)
		value = 11;
		System.out.println("Int value before executing a method " + value); // 11
		//try  to change it
		changeInt(value);
		System.out.println("Int value after executing a method " + value); // 11
	}
}
