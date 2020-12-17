import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(new Integer(1), "vinodh");
		map.put(new Integer(2), "kumar");
		map.put(new Integer(3), "mahendra");

		//System.out.println(map);
		//for each loop
		for(Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey() + " " +e.getValue());
		}
		
		System.out.println(map);
		
		System.out.println(entriesSortedByValues(map));
	}
	
	static <K,V extends Comparable<? super V>>
	SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}
}
