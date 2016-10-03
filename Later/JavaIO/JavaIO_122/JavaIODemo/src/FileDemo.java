import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/*
 * public String[] list(FilenameFilter filter)
 *
 * Parameters:
 * ----------
 *
 * filter - A filename filter
 *
 * How to use FilenameFilter to list out all files that
 * are end with “.txt” extension in folder “D:/work“. *
 */

public class FileDemo
{

	private static final String DIRECTORY_NAME = "D:/work";
	private static final String FILE_EXTENSION = ".txt";

	public static void main(String[] args) throws IOException, ParseException
	{
		FileDemo fileDemo = new FileDemo();
		fileDemo.deleteFiles(DIRECTORY_NAME);
	}

	public void listOutFiles(String dirName,String fileExtension)
	{
		File fileDir = new File(dirName);

		ExtensionFilter extFilter = new ExtensionFilter(fileExtension);

		/*
		 * Returns an array of strings naming the files and
		 * directories in the directory denoted by this
		 * abstract pathname that satisfy the specified
		 * filter.
		 */
		String[] listOfFileNames = fileDir.list(extFilter);

		if (listOfFileNames.length == 0)
		{
			System.out.println("No files end with : " + FILE_EXTENSION);
			return;
		}

		for (String fileName : listOfFileNames)
		{
			System.out.println(fileName);
		}

	}

}
