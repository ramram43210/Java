import java.io.CharArrayWriter;
import java.io.IOException;

/*
 * public CharArrayWriter append(CharSequence csq)
 *
 * Parameters:
 * ----------
 *
 * csq - The character sequence to append. If csq is
 * null, then the four characters "null" are appended to
 * this writer.
 */

public class CharArrayWriterDemo
{

	public static void main(String[] args) throws IOException
	{

		CharArrayWriter charArrayWriter = new CharArrayWriter();
		charArrayWriter.write("Peter is going to India,");

		CharSequence csq = "John is going to Japan.";
		/*
		 * Appends the specified character sequence to this
		 * writer.
		 */
		charArrayWriter.append(csq);
		System.out.println(charArrayWriter.toString());

	}
}
