import java.io.CharArrayWriter;
import java.io.IOException;

/*
 * public CharArrayWriter append(char c)
 * 
 * Parameters: 
 * ----------
 * 
 * c - The 16-bit character to append. * 
 */
public class CharArrayWriterDemo
{

	public static void main(String[] args) throws IOException
	{

		CharArrayWriter charArrayWriter = new CharArrayWriter();
		charArrayWriter.write("Peter is going to India,");

		char ch = 'R';
		/*
		 * Appends the specified character to this writer.
		 */
		charArrayWriter.append(ch);
		System.out.println(charArrayWriter.toString());

	}
}
