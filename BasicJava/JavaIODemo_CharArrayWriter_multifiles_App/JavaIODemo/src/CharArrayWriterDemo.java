import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * public void writeTo(Writer out) throws IOException
 * 
 * Parameters:
 * ----------- 
 * 
 * out - the output stream to write to
 */
public class CharArrayWriterDemo
{

	public static void main(String[] args) throws IOException
	{

		FileWriter fileWriter1 = null;
		FileWriter fileWriter2 = null;
		try
		{
			CharArrayWriter charArrayWriter = new CharArrayWriter();
			charArrayWriter.write("Peter is going to India");

			fileWriter1 = new FileWriter("myfile1.txt");
			fileWriter2 = new FileWriter("myfile2.txt");

			/*
			 * Writes the contents of the buffer to another
			 * character stream.
			 */
			charArrayWriter.writeTo(fileWriter1);
			charArrayWriter.writeTo(fileWriter2);
			System.out.println("Successfully written to two files.");
		}
		finally
		{
			if (fileWriter1 != null)
			{
				fileWriter1.close();
			}
			if (fileWriter2 != null)
			{
				fileWriter2.close();
			}
		}

	}
}
