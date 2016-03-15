/*
 * public String replaceFirst(String regex, String
 *                                         replacement)
 * 
 * Parameters: 
 * ---------- 
 * regex - the regular expression to which this
 * string is to be matched. 
 * 
 * replacement - the string to be substituted 
 * for the first match.
 * 
 * Returns: 
 * ------- 
 * Replaces the first substring of this string that
 * matches the given regular expression with the
 * given replacement.
 * 
 * Throws: 
 * ------ 
 * PatternSyntaxException - if the regular
 * expression's syntax is invalid.
 */

public class ReplaceFirstDemo
{

	public static void main(String[] args)
	{
		String str = "My name is Peter,her name is Juli";
		System.out.println("str         =  " + str);

		String replacedStr = str.replaceFirst("is", "was");
		System.out.println("replacedStr =  " + replacedStr);

	}
}
