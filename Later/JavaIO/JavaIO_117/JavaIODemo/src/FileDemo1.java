import java.io.File;
import java.io.IOException;
/*
 * Using File.separator construct the file path.
 */
public class FileDemo1
{

	public static void main(String[] args) throws IOException
	{
		String filename = "myfile.txt";
		String workingDirectory = System.getProperty("user.dir");

		String filePath = workingDirectory + File.separator + filename;

		System.out.println("filePath : " + filePath);

		File file = new File(filePath);

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
