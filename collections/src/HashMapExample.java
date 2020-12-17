import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(new Integer(1), "vinodh");
		map.put(new Integer(2), "kumar");
		map.put(new Integer(3), "mahendra");

		//System.out.println(map);
		//for each loop
		for(Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}

}
