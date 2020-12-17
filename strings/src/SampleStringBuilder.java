
public class SampleStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Happy");
		sb.append("Learning");
		System.out.println(sb);
		
		System.out.println(sb.delete(0, 1));
		System.out.println(sb.insert(1, "Welcome"));
		System.out.println(sb.reverse());
		
		System.out.println("conversion of String to StringBuffer and StringBuilder");
		
		String str = "Hello";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		
		StringBuilder sbuild = new StringBuilder(str);
		sbuild.append("world");
		System.out.println("String to StringBuilder");
		System.out.println(sbuild);
	}

}
