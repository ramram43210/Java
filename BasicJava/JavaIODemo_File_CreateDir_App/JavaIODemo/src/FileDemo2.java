import java.io.File;

public class FileDemo2
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/java/arraylist/src");
		/*
		 * Creates the directory named by this abstract
		 * pathname, including any necessary but nonexistent
		 * parent directories.
		 *
		 * Returns: true if and only if the directory was
		 * created, along with all necessary parent
		 * directories; false otherwise
		 */
		boolean dirCreated = file.mkdirs();
		System.out.println(file.getAbsolutePath()
				+ " directory Created ? = " + dirCreated);
	}

}
