import java.io.File;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		File tempFile = File.createTempFile("temp", ".txt");

		/*
		*will give you the full complete path name (filepath + filename) of a file.
		*/
		String absolutePath = temp.getAbsolutePath();
		System.out.println("File path : " + absolutePath);

		String filePath = absolutePath.substring(0,
				absolutePath.lastIndexOf(File.separator));

		System.out.println("File path : " + filePath);

	}

}
