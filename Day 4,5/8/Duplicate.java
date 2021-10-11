import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Duplicate {

	public static String removeDuplicateWords(String input)
	{
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

		Matcher m = p.matcher(input);

		while (m.find()) {
			input
				= input.replaceAll(
					m.group(),
					m.group(1));
		}
		return input;
	}


	public static void main(String args[])
	{

		String str1
			= "I can Can Do do This this";
		System.out.println(
			removeDuplicateWords(str1));

	}
}
