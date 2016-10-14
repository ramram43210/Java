import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenizerDemo
{

	public static void main(String[] args) throws IOException
	{
		StreamTokenizer streamTokenizer = null;
		StringReader stringReader = new StringReader("Peter had 1 pen.");

		streamTokenizer = new StreamTokenizer(stringReader);

		while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF)
		{

			if (streamTokenizer.ttype == StreamTokenizer.TT_WORD)
			{
				System.out.println("Inside TT_Word = " + streamTokenizer.sval);
			}
			else if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER)
			{
				System.out
						.println("Inside TT_NUMBER = " + streamTokenizer.nval);
			}
		}

	}

}
