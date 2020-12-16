
public class TestCalculator {

	public static void main(String[] args) {
		//create an object (instance) of Calculator
		Calculator object = new Calculator();
		
		int result;
		//invoke a method multiply
		result = object.multiply(10,5); // 10,5 actual parameter
		
		System.out.println("the multiply (10,5 ) is :" + result);
	}

}
