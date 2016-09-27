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
 * are end with “.txt” extension in folder “D:/work“,
 * and then delete it.
 */

public class FileDemo
{

	private static final String DIRECTORY_NAME = "D:/work";

	public static void main(String[] args) throws IOException, ParseException
	{
		FileDemo fileDemo = new FileDemo();
		fileDemo.deleteFiles(DIRECTORY_NAME);
	}

	public void deleteFiles(String dirName)
	{
		File fileDir = new File(dirName);

		ExtensionFilter extFilter = new ExtensionFilter(".txt");

		/*
		 * Returns an array of strings naming the files and
		 * directories in the directory denoted by this
		 * abstract pathname that satisfy the specified
		 * filter.
		 */
		String[] listOfFileNames = fileDir.list(extFilter);

		for (String fileName : listOfFileNames)
		{
			File file = new File(DIRECTORY_NAME + File.separator + fileName);
			boolean isDeleted = file.delete();
			System.out.println(file.getAbsolutePath() + " isDeleted = "
					+ isDeleted);
		}

	}

}
