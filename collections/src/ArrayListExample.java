import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList object = new ArrayList();
		object.add("one");
		object.add("second");
		object.add("3rd");
		object.add(new Integer(4));
		object.add(new Float(5.0F));
		
		object.add("second"); // duplicate , is added
		object.add(new Integer(4));//duplicate , is added
		
		System.out.println(object);
		
		// how many elements are present in ArrayList collection
		System.out.println("the size : " + object.size());//Set
		
		//check whether the ArrayList is empty
		System.out.println("is my list empty " +object.isEmpty());//Set
		
		//use a contains
		System.out.println("whether contains one " +object.contains("one"));//Set
		
		//using remove
		System.out.println("remove one element :" +object.remove("one"));
		
		System.out.println(object);
		
		//methods available only to List
		object.add(0, "one");
		System.out.println(object.get(2));
		object.set(2, "III");
		System.out.println("using list iterator");
		ListIterator listIterator = object.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next()); // forward
		}
		
		System.out.println("traverse the list in backward");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
