import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizerDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try
		{
			fileReader = new FileReader("myfile.txt");
			bufferedReader = new BufferedReader(fileReader);
			StreamTokenizer st = new StreamTokenizer(bufferedReader);

			// print the stream tokens
			boolean eof = false;
			do
			{
				/*
				 * Parses the next token from the input
				 * stream of this tokenizer. The type of the
				 * next token is returned in the ttype
				 * field. Additional information about the
				 * token may be in the nval field or the
				 * sval field of this tokenizer.
				 *
				 * Typical clients of this class first set
				 * up the syntax tables and then sit in a
				 * loop calling nextToken to parse
				 * successive tokens until TT_EOF is
				 * returned.
				 */
				int token = st.nextToken();
				switch (token)
				{
				case StreamTokenizer.TT_EOF:
					System.out.println("End of File encountered.");
					eof = true;
					break;
				case StreamTokenizer.TT_EOL:
					System.out.println("End of Line encountered.");
					System.out.println("Line Number:" + st.lineno());
					break;
				case StreamTokenizer.TT_WORD:
					System.out.println("Word: " + st.sval);
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println("Number: " + st.nval);
					break;
				default:
					System.out.println((char) token + " encountered.");
					if (token == '!')
					{
						eof = true;
					}
				}
			}
			while (!eof);
		}
		finally
		{
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}

	}

}
