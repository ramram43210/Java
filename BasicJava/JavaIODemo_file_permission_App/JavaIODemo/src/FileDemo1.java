import java.io.File;

public class FileDemo1
{

	public static void main(String[] args)
	{
		File file = new File("/home/hello.sh");

		/*
		 * Marks the file or directory named by this
		 * abstract pathname so that only read operations
		 * are allowed.
		 */
		file.setReadOnly();

		if (file.canWrite())
		{
			System.out.println("This file is writable");
		}
		else
		{
			System.out.println("This file is read only");
		}

		/*
		 * A convenience method to set the owner's write
		 * permission for this abstract pathname.
		 */
		file.setWritable(true);

		if (file.canWrite())
		{
			System.out.println("This file is writable");
		}
		else
		{
			System.out.println("This file is read only");
		}

	}

}
