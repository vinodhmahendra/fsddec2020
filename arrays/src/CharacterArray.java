
public class CharacterArray {
	
	public char[] createArray() {
		//declare a char[TYPE] array variable
		char[] s;
		
		//create an array object
		s = new char[26];
		
		//Initialize an array
		for(int index = 0 ; index < 26 ; index++) {
			s[index] = (char)('A' + index);
		}
		
		//return an array
		return s;
	}

	public static void main(String[] args) {
		char[] characters = new CharacterArray().createArray();
		printElements(characters);
	}

	private static void printElements(char[] characters) {
		/*for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}*/
		//for each loop
		for(char element: characters) {
			System.out.println(element);
		}
		
	}
}
