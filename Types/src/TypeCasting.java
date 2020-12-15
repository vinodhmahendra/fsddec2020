
public class TypeCasting {
	
	public static void main(String[] args) {
		// implicit conversion
		char a = 'A';
		System.out.println("value of a  : " + a);
		int b = a;
		System.out.println("value of b :" +b);
		
		float c = a;
		System.out.println("value of c :" +c) ;
		
		long d = a;
		System.out.println("value of d :" + d);
		
		double e = a;
		System.out.println("value of e :" +e);
		
		System.out.println("Explicit Type Casting");
		double x = 45.5;
		int y = (int)x;
		System.out.println("value of x: "+ x);
		System.out.println("value of y: "+ y);
	
	}

}
