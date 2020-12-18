
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee("Tom");
		System.out.println(employee.getTitle());
		
		employee.promoteToManager();
		
		try {
			employee.promoteToCEO();
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(employee.getTitle());
		}

	}

}
