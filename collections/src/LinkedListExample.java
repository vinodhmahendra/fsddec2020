import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList object = new LinkedList();
		object.add("one");
		object.add("second");
		object.add("3rd");
		object.add(new Integer(4));
		object.add(new Float(5.0F));
		
		object.add("second"); // duplicate , is added
		object.add(new Integer(4));//duplicate , is added
		
		//System.out.println(object);
		Iterator iterator = object.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
