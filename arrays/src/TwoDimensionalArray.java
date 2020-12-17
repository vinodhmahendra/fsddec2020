
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] twoDim = {
				{1},{1,2},{1,2,3},{1,2,3,4},{1,2,3,4,5}
		};
		
		for(int eachArray = 0 ; eachArray < twoDim.length; eachArray++) {
			for(int howmanyelements = 0 ; howmanyelements<twoDim[eachArray].length;howmanyelements++) {
				System.out.print(twoDim[eachArray][howmanyelements] + " ");
			}
			
			System.out.println();
		}
		
	}

}
