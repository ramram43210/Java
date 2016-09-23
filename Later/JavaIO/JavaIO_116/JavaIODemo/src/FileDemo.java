import java.io.File;
import java.io.IOException;

/*
 *	Create a new file.
 */
public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("D:/work/myfile.txt");

		/*
		 * Atomically creates a new, empty file named by
		 * this abstract pathname if and only if a file with
		 * this name does not yet exist.
		 * 
		 * Returns: true if the named file does not exist
		 * and was successfully created; false if the named
		 * file already exists
		 */
		if (file.createNewFile())
		{
			System.out.println("File is created!");
		}
		else
		{
			System.out.println("File already exists.");
		}
	}

}
