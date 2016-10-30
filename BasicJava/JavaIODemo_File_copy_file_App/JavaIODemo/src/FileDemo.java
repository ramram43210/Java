import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo
{
	public static void main(String[] args) throws IOException
	{
		FileDemo fileDemo = new FileDemo();
		fileDemo.copyFile("D:/work/hello.txt", "D:/work/New_hello.txt");
	}

	private void copyFile(String srcFileName, String destFileName)
			throws IOException
	{
		InputStream is = null;
		OutputStream os = null;

		try
		{

			File srcFile = new File(srcFileName);
			File destFile = new File(destFileName);

			is = new FileInputStream(srcFile);
			os = new FileOutputStream(destFile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = is.read(buffer)) > 0)
			{
				os.write(buffer, 0, length);
			}

			System.out.println("File is copied successful!");

		}
		finally
		{
			if (is != null)
			{
				is.close();
			}
			if (os != null)
			{
				os.close();
			}
		}

	}

}
