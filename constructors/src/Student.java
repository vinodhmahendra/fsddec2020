
public class Student {
	
	private int id;
	private String name;
	
	//parameterized constructor
	public Student(int i , String n) {
		id = i;
		name = n;
	}
	
	public void display() {
		System.out.println(id + "    " + name);
	}

}
