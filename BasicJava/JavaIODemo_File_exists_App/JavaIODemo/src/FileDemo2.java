import java.io.File;

/*
 *Once you have instantiated a File object we can check
 *if the corresponding file/dir actually exists already.
 */
public class FileDemo2
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/");
		/*
		 * Tests whether the file or directory denoted by
		 * this abstract pathname exists.
		 */
		boolean isExist = file.exists();
		System.out.println(file.getAbsolutePath() + " is exist? = " + isExist);
	}

}
