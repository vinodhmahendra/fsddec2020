
public class SampleStringBuffer {

	public static void main(String[] args) {
		
		System.out.println("creating StringBuffer");
		StringBuffer sb = new StringBuffer("Welcome to java!");
		sb.append("Enjoy your learning");
		System.out.println(sb);
		
		sb.insert(0, 'w');
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.replace(0, 2, "hEl");
		System.out.println(sb1);
		
		sb1.delete(0, 1);
		System.out.println(sb1);

	}

}
