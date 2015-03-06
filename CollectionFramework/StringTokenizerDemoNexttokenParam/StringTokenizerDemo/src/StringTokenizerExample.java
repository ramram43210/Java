import java.util.StringTokenizer;

/*
 * Example of nextToken(String delim)
 */
public class StringTokenizerExample
{

	public static void main(String[] args)
	{
		String strValue = "Peter&is&playing&football";
		String delimter = "&";

		StringTokenizer stringTokenizer = new StringTokenizer(strValue);
	
		int i = 1;

		/*
		 * Tests if there are more tokens available from this tokenizer's
		 * string. If this method returns true, then a subsequent call to
		 * nextToken with no argument will successfully return a token.
		 */

		while (stringTokenizer.hasMoreTokens())
		{
			/*
			 * Returns the next token in this string tokenizer's string.
			 */
			String token = stringTokenizer.nextToken(delimter);
			System.out.println("Token " + i + " : " + token);
			++i;
		}

	}
}
