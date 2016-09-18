import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenizerDemo
{

	public static void main(String[] args) throws IOException
	{
		StringReader stringReader = new StringReader("Peter welcome to India");
		StreamTokenizer tokenizer = new StreamTokenizer(stringReader);
		/*
		 * TT_EOL is used to determine end of line
		 */
		while (tokenizer.nextToken() != StreamTokenizer.TT_EOF)
		{
			/*
			 * sval-The string value of the token, if the
			 * token was a string (word)
			 */
			System.out.println(tokenizer.sval);
		}

	}

}
