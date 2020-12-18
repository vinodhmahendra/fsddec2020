import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assited {

	public static void main(String[] args) {
		
		String regex = "[a-z]+";
		
		String check = "Regular Expressions";
		
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(check);
		
		
		while (matcher.find()) {
			System.out.println(check.substring(matcher.start(), matcher.end()));
		}

	}

}
