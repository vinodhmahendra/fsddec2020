
public class FinallyBlockDemo {

	public static void main(String[] args) {
		int a = 45 , b =0 ,rs = 0;
		try {
			rs = a/b;
		}catch(ArithmeticException e) {
			System.out.println("\n\t Error :" + e.getMessage());
		}finally{
			System.out.println("\n\t The result is : "+rs);
		}

	}

}
