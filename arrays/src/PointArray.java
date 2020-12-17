
public class PointArray {
	
	public Point[] createArray() {
		//declare an array of Point type
		Point[] p;
		//create an array
		p = new Point[10];
		
		//initialize an array
		for (int index  = 0; index < 10 ; index++) {
			p[index] = new Point(index,index+1);
		}
		
		//return the array of point object
		return p;
		
	}
	
	public static void main(String[] args) {
		Point[] points = new PointArray().createArray();
		printElements(points);
	}

	private static void printElements(Point[] points) {
		for (Point element : points) {
			System.out.println(element.display());
		}
		
	}

}
