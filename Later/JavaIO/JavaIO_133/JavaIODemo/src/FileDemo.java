import java.io.File;
/*
 * Check if a directory is empty
 */
public class FileDemo
{

	private static final String DIR = "D:/work/java";

	public static void main(String[] args)
	{

		File file = new File(DIR);

		if (file.isDirectory())
		{
			if (file.list().length > 0)
			{
				System.out.println("Directory is not empty!");
			}
			else
			{
				System.out.println("Directory is empty!");
			}
		}
		else
		{
			System.out.println("This is not a directory");
		}

	}

}
