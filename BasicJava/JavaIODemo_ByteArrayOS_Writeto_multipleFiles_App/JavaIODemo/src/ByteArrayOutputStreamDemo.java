import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fileOutputStream1 = null;
		FileOutputStream fileOutputStream2 = null;
		ByteArrayOutputStream byteArrayOutputStream = null;
		try
		{
			fileOutputStream1 = new FileOutputStream("myfile1.txt");
			fileOutputStream2 = new FileOutputStream("myfile2.txt");
			byteArrayOutputStream = new ByteArrayOutputStream();

			String str = "Welcome to India";
			byte[] byteArray = str.getBytes();
			byteArrayOutputStream.write(byteArray);

			/*
			 * Writes the complete contents of this byte
			 * array output stream to the specified output
			 * stream argument
			 */
			byteArrayOutputStream.writeTo(fileOutputStream1);
			byteArrayOutputStream.writeTo(fileOutputStream2);

			byteArrayOutputStream.flush();
			System.out.println("successfully written to two files...");
		}
		finally
		{
			if (fileOutputStream1 != null)
			{
				fileOutputStream1.close();
			}
			if (fileOutputStream2 != null)
			{
				fileOutputStream2.close();
			}
			if (byteArrayOutputStream != null)
			{
				byteArrayOutputStream.close();
			}
		}
	}
}
