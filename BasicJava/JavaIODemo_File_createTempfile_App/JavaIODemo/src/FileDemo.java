import java.io.File;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		File tempFile = File.createTempFile("temp", ".txt");

		/*
		 * Will give you the full complete path name
		 * (filepath + filename) of a file.
		 */
		String absolutePath = tempFile.getAbsolutePath();
		System.out.println("File path : " + absolutePath);

	}

}
