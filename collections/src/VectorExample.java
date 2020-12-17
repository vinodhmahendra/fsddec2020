import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector object = new Vector();
		
		object.add("one");
		object.add("second");
		object.add("3rd");
		object.add(new Integer(4));
		object.add(new Float(5.0F));
		object.addElement(new Integer(15));
		
		object.add("second"); // duplicate , is added
		object.add(new Integer(4));//duplicate , is added
		
		System.out.println(object);

	}

}
