import java.io.File;

public class FileDemo
{

	public static void main(String[] args)
	{
		File file = new File("D:/eclipse/backup/Java/.git");

		/*
		 * Returns: true if and only if the file denoted by
		 * this abstract pathname is hidden according to the
		 * conventions of the underlying platform
		 */
		if (file.isHidden())
		{
			System.out.println("This file is hidden");
		}
		else
		{
			System.out.println("This file is not hidden");
		}
	}

}
