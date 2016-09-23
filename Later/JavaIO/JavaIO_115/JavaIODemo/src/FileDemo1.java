import java.io.File;

/*
 *	Read List of Files in a Directory
 */
public class FileDemo1
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/");
		/*
		 * Returns an array of strings naming the files and
		 * directories in the directory denoted by this
		 * abstract pathname.
		 */
		String[] strArray = file.list();

		for (String fileName : strArray)
		{
			System.out.println(fileName);
		}
	}

}
