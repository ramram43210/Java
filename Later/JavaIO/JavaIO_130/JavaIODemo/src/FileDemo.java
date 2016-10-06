import java.io.File;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * Creates an empty file in the default
		 * temporary-file directory, using the given prefix
		 * and suffix to generate its name.
		 */
		File temp = File.createTempFile("myfile", ".tmp");

		System.out.println("Temp file : " + temp.getAbsolutePath());

	}

}
