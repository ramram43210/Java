import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumberReaderDemo
{

	public static void main(String[] args) throws Exception
	{
		LineNumberReader lineNumberReader = null;
		FileReader fileReader = null;
		try
		{
			fileReader = new FileReader("myfile.txt");
			lineNumberReader = new LineNumberReader(fileReader);

			String line;
			while ((line = lineNumberReader.readLine()) != null)
			{
				int lineNumber = lineNumberReader.getLineNumber();
				System.out.println(lineNumber + " = " + line);
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