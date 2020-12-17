import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet object = new LinkedHashSet();
		object.add("one");
		object.add("second");
		object.add("3rd");
		object.add(new Integer(4));
		object.add(new Float(5.0F));
		
		object.add("second"); // duplicate , is not added
		object.add(new Integer(4));//duplicate , is not added
		
		System.out.println(object);
	}

}
