package strings;

public class SampleString {

	public static void main(String[] args) {
		// methods present in String class
		System.out.println("methods of String class");
		String s1 = new String("Hello World!");
		
		System.out.println("the length of s1 is " +s1.length());
		
		String substring = new String("welcome");
		System.out.println(substring.substring(2));
		
		String s2 = "Hello";
		String s3 = "Heldddo";
		System.out.println(s2.compareTo(s3));
		
		String s4 = "";
		System.out.println(s4.isEmpty());
		
		String s5 = "Hello";
		System.out.println(s5.toLowerCase());
		
		String replace = s3.replace('d', 'l');
		System.out.println(replace);
		
		String x= "Welcome to Java";
		String y = "WeLcOmE tO jaVa";
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));
	}

}
