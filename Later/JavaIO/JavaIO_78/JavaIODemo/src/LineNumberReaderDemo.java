import java.io.FileReader;
import java.io.LineNumberReader;

/*
 * public LineNumberReader(Reader in, int sz)
 * 
 * Parameters:
 * ----------
 * 
 * in - A Reader object to provide the underlying stream. 
 * sz - An int specifying the size of the buffer.
 */
public class LineNumberReaderDemo
{

	public static void main(String[] args) throws Exception
	{
		LineNumberReader lineNumberReader = null;
		FileReader fileReader = null;
		try
		{
			int bufferSize = 1024;
			fileReader = new FileReader("myfile.txt");
			/*
			 * Create a new line-numbering reader, reading
			 * characters into a buffer of the given size.
			 */
			lineNumberReader = new LineNumberReader(fileReader, bufferSize);

			String line;
			while ((line = lineNumberReader.readLine()) != null)
			{
				int lineNumber = lineNumberReader.getLineNumber();
				System.out.println(lineNumber + "." + line);
			}
		}
		finally
		{
			if (lineNumberReader != null)
			{
				/*
				 * When you are finished reading characters
				 * from the LineNumberReader you should
				 * remember to close it. Closing a
				 * LineNumberReader will also close the
				 * Reader instance from which the
				 * LineNumberReader is reading.
				 */
				lineNumberReader.close();
			}
		}
	}
}