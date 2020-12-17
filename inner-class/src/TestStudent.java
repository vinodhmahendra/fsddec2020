interface Student {
	void eat();
}
public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student() {
			
			@Override
			public void eat() {
				System.out.println("eating fruits");				
			}
		};
		
		student.eat();
	}
}
