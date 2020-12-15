import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConvertStringToOtherTypes {

	public static void main(String[] args) {
		
		Scanner keyboardScan = new Scanner(System.in);
		
		/*
		System.out.println("Enter the value int : ");
		int x = keyboardScan.nextInt();
		System.out.println("the value of x " + x);
		*/
		
		
		String xint = JOptionPane.showInputDialog("Enter the value for xInt :");
		int x = Integer.parseInt(xint);
		System.out.println("value of x: " +x);
		

	}

}
