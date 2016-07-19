import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * public void write(byte[] b, int off, int len) throws
 *                                             IOException
 * 
 * Parameters: 
 * ---------- 
 * b - the data. 
 * off - the start offset in the data. 
 * len - the number of bytes to write.
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

			/*
			 * Writes len bytes from the specified byte
			 * array starting at offset off to this buffered
			 * output stream.
			 */
			bufferedOutputStream.write(byteArray, 18, 5);
			/*
			 * Flushes this buffered output stream. This
			 * forces any buffered output bytes to be
			 * written out to the underlying output stream.
			 */
			bufferedOutputStream.flush();
			System.out.println("Successfully written to the file."
					+ "please check the file content.");

		}
		catch (Exception exe)
		{
			exe.printStackTrace();
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
