import java.io.File;
import java.io.IOException;

/*
 * Like below construct the file path.
 * File file = new File(workingDir, filename); 
 */
public class FileDemo2
{

	public static void main(String[] args) throws IOException
	{
		String filename = "myfile.txt";
		String workingDirectory = System.getProperty("user.dir");

		File file = new File(workingDirectory, filename);

		System.out.println("filepath : " + file.getAbsolutePath());
		
		if (file.createNewFile())
		{
			System.out.println("File is created!");
		}
		else
		{
			System.out.println("File is already existed!");
		}

	}

}
