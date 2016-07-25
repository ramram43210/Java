import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * public BufferedWriter(Writer out, int sz)
 * 
 * Parameters: 
 * ----------
 * 
 * out - A Writer. 
 * sz - Output-buffer size, a positive integer.
 */
public class BufferedWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		BufferedWriterDemo BufferedWriterDemo = new BufferedWriterDemo();
		BufferedWriterDemo.writeFile();
	}

	private void writeFile() throws IOException
	{
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try
		{
			int bufferSize = 8 * 1024;
			fileWriter = new FileWriter("myoutputfile.txt");
			/*
			 * Creates a new buffered character-output
			 * stream that uses an output buffer of the
			 * given size.
			 */
			bufferedWriter = new BufferedWriter(fileWriter, bufferSize);

			String line1 = "Peter is going to India.";
			String line2 = "John is going to India.";

			// writing string to writer
			bufferedWriter.write(line1);
			bufferedWriter.newLine();
			bufferedWriter.write(line2);

			// forces out the characters to file writer
			bufferedWriter.flush();
			System.out.println("Sucessfully written to the file,"
					+ " please check the file content.");

		}
		finally
		{
			if (fileWriter != null)
			{
				fileWriter.close();
			}
			if (bufferedWriter != null)
			{
				bufferedWriter.close();
			}
		}
	}

}
