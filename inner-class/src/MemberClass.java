
public class MemberClass {

	//define an instance variable
	private int data = 100;
	
	class InnerClass {
		void message() {
			// access the private data member of MemberClass (outer class)
			System.out.println("the private data is :" +data);
		}
	}
	
	public static void main(String[] args) {
		//create an object of outer class (i.e. MemberClass)
		MemberClass outer = new MemberClass();
		
		//create an object  of inner class
		MemberClass.InnerClass inner = outer.new InnerClass();
		inner.message();
		
//		outer.message();
	}
	
	
}
