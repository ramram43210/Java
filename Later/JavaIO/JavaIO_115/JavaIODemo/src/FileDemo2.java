import java.io.File;

/*
 *	Read List of Files in a Directory
 */
public class FileDemo2
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/");
		/*
		 * Returns an array of abstract pathnames denoting
		 * the files in the directory denoted by this
		 * abstract pathname.
		 */
		File[] fileArray = file.listFiles();

		for (File file2 : fileArray)
		{
			System.out.println(file2.getName());
		}
	}

}
