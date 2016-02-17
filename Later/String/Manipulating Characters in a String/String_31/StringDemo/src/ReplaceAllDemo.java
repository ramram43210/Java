public class ReplaceAllDemo
{

	public static void main(String[] args)
	{
		String str = "My name is Peter,her name is Juli";
		System.out.println("str         =  " + str);

		/*
		 * public String replaceAll(String regex, String
		 *                                       replacement)
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * regex - the regular expression to which this
		 * string is to be matched.
		 * 
		 * replacement - the string* to be substituted for
		 * each match.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * Replaces each substring of this string that
		 * matches the given regular expression with the
		 * given replacement.
		 * 
		 * Throws: 
		 * ------ 
		 * 
		 * PatternSyntaxException - if the
		 * regular expression's syntax is invalid.
		 */

		String replacedStr = str.replaceAll("is", "was");
		System.out.println("replacedStr =  " + replacedStr);
		
		replacedStr = replacedStr.replaceAll("\\s", "_");
		System.out.println("replacedStr =  "+replacedStr);

	}
}
