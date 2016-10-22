import java.io.File;

public class FileDemo1
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/myfile.txt");
		/*
		 * Deletes the file or directory denoted by this
		 * abstract pathname.
		 * 
		 * Returns: true if and only if the file or
		 * directory is successfully deleted; false
		 * otherwise
		 */
		boolean success = file.delete();
		System.out.println("success = " + success);
	}

}
