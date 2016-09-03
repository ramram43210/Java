import java.io.CharArrayWriter;
import java.io.IOException;

/*
 * public CharArrayWriter append(CharSequence csq, int
 *                                          start, int end)
 *
 * Parameters:
 * ----------
 *
 * csq - The character sequence from which a subsequence
 * will be appended. If csq is null, then characters
 * will be appended as if csq contained the four
 * characters "null".
 *
 * start - The index of the first character in the
 * subsequence
 *
 * end - The index of the character following the last
 * character in the subsequence
 */
public class CharArrayWriterDemo
{

	public static void main(String[] args) throws IOException
	{

		CharArrayWriter charArrayWriter = new CharArrayWriter();
		charArrayWriter.write("Peter is going to India,");

		CharSequence csq = "John is going to Japan.";
		/*
		 * Appends a subsequence of the specified character
		 * sequence to this writer.
		 */
		charArrayWriter.append(csq, 0, 4);
		System.out.println(charArrayWriter.toString());

	}
}
