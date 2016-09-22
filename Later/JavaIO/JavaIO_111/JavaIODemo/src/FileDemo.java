import java.io.File;

public class FileDemo
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/myfile.txt");
		/*
		 * Returns the length of the file denoted by this
		 * abstract pathname. The return value is
		 * unspecified if this pathname denotes a directory.
		 * 
		 * Returns: The length, in bytes, of the file
		 * denoted by this abstract pathname, or 0L if the
		 * file does not exist.
		 */
		long length = file.length();
		System.out.println("length = " + length);
	}

}
