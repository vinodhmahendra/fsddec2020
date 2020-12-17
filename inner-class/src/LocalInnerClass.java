
public class LocalInnerClass {
	
	private int data = 100;
	
	void getDetails() {
		//define a class
		
		class Local {
			void greet() {
				System.out.println("the data is  : " + data);
			}
		}
		
		Local local = new Local();
		local.greet();
	}// end  of getDetails method
	
	public static void main(String[] args) {
		LocalInnerClass object  = new LocalInnerClass();
		object.getDetails();
	}

}
