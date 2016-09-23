import java.io.File;

/*
 * Check if Path is File or Directory
 */
public class FileDemo1
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/myfile.txt");
		/*
		 * Tests whether the file denoted by this abstract
		 * pathname is a normal file.
		 * 
		 * Returns: true if and only if the file denoted by
		 * this abstract pathname exists and is a normal
		 * file; false otherwise
		 */
		boolean isFile = file.isFile();
		System.out.println("isFile = " + isFile);
	}

}
