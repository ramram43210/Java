import java.io.File;

/*
 * Check if Path is File or Directory
 */
public class FileDemo2
{

	public static void main(String[] args)
	{
		File file = new File("D:/work");
		/*
		 * Tests whether the file denoted by this abstract
		 * pathname is a directory.
		 * 
		 * Returns: true if and only if the file denoted by
		 * this abstract pathname exists and is a directory;
		 * false otherwise.
		 */
		boolean isDir = file.isDirectory();
		System.out.println("isDir = " + isDir);
	}

}
