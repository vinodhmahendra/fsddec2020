abstract class Employee {

	abstract void eat();

}

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee() {
			
			@Override
			void eat() {
				System.out.println(" eat's pizza!");
				
			}
		};// end of anonymous inner class
		
		employee.eat();
	}
}
