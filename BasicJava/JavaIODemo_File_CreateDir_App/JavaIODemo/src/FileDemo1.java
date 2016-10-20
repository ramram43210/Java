import java.io.File;

public class FileDemo1
{

	public static void main(String[] args)
	{
		File file = new File("D:/work/java");
		/*
		 * Creates the directory named by this abstract
		 * pathname.
		 * 
		 * Returns: true if and only if the directory was
		 * created; false otherwise
		 */
		boolean dirCreated = file.mkdir();
		System.out.println(file.getAbsolutePath()
				+ " directory Created? = " + dirCreated);
	}

}
