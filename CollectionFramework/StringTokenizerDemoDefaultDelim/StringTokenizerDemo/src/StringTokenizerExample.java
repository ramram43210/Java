import java.util.StringTokenizer;

public class StringTokenizerExample
{

	public static void main( String[] args )
	{
		String strValue = "Peter is playing football";

		StringTokenizer stringTokenizer = new StringTokenizer(strValue);

		/*
		 * Calculates the number of times that this tokenizer's nextToken method
		 * can be called before it generates an exception. The current position
		 * is not advanced.
		 */

		System.out.println("Total Token Count :" + stringTokenizer.countTokens()
		        + "\n");

		int i = 1;

		/*
		 * Tests if there are more tokens available from this tokenizer's
		 * string. If this method returns true, then a subsequent call to
		 * nextToken with no argument will successfully return a token.
		 */

		while( stringTokenizer.hasMoreTokens() )
		{
			/*
			 * Returns the next token from this string tokenizer.
			 */
			String token = stringTokenizer.nextToken();
			System.out.println("Token " + i + " : " + token);
			++i;
		}

	}
}
