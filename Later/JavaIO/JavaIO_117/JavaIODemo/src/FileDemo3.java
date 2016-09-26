import java.io.File;
import java.io.IOException;

/*
 * Check the system OS and create file path manually, not recommend. 
 */
public class FileDemo3
{

	public static void main(String[] args) throws IOException
	{
		String filename = "myfile.txt";
		String workingDir = System.getProperty("user.dir");

		String absoluteFilePath = "";

		String os = System.getProperty("os.name").toLowerCase();

		if (os.indexOf("win") >= 0)
		{

			// if windows
			absoluteFilePath = workingDir + "\\" + filename;

		}
		else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0
				|| os.indexOf("mac") >= 0)
		{

			// if unix or mac
			absoluteFilePath = workingDir + "/" + filename;

		}
		else
		{

			// Unknown OS
			absoluteFilePath = workingDir + "/" + filename;

		}

		System.out.println("filepath = " + absoluteFilePath);

		File file = new File(absoluteFilePath);

		if (file.createNewFile())
		{
			System.out.println("File is created!");
		}
		else
		{
			System.out.println("File already exists!");
		}

	}

}
