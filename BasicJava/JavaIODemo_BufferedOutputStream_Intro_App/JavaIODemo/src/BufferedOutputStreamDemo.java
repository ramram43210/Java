import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * In this example, we are writing the textual
 * information in the BufferedOutputStream object which
 * is connected to the FileOutputStream object. The
 * flush() flushes the data of one stream and send it
 * into another. It is required if you have connected
 * the one stream with another.
 */
public class BufferedOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		BufferedOutputStreamDemo bufferedOutputStreamDemo = new BufferedOutputStreamDemo();
		bufferedOutputStreamDemo.writeFile();
	}

	private void writeFile() throws IOException
	{

		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null;

		try
		{
			fileOutputStream = new FileOutputStream("myoutputfile.txt");
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			String str = "Peter is going to India.";
			byte byteArray[] = str.getBytes();
			bufferedOutputStream.write(byteArray);
			/*
			 * Flushes this buffered output stream. This
			 * forces any buffered output bytes to be
			 * written out to the underlying output stream.
			 */
			bufferedOutputStream.flush();
			System.out.println("Successfully written to the file."
					+ "please check the file content.");

		}
		finally
		{
			if (fileOutputStream != null)
			{
				fileOutputStream.close();
			}
			if (bufferedOutputStream != null)
			{
				bufferedOutputStream.close();
			}
		}
	}

}
