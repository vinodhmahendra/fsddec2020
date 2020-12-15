package simplilearn;

public class AccessSpecifierPrivate {

	public static void main(String[] args) {
		System.out.println("Demo on Private Access Specifier");
		//create an object of PrivateAccessSpecifier
		PrivateAccessSpecifier object = new PrivateAccessSpecifier();
		//invoke a display method
		//object.display() member can't access because private
	}

}
