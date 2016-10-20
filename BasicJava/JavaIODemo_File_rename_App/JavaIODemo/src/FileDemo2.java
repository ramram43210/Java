import java.io.File;

/*
 * public boolean renameTo(File dest)
 * 
 * Parameters: 
 * ----------
 * 
 * dest - The new abstract pathname for the named file
 */
public class FileDemo2
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/myfile.txt");
		/*
		 * Renames the file denoted by this abstract
		 * pathname.
		 * 
		 * Returns: true if and only if the renaming
		 * succeeded; false otherwise
		 */
		boolean success = file.renameTo(new File("D:/work/misc/java.txt"));
		System.out.println("success = " + success);
	}

}
