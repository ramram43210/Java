import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/*
 * public File[] listFiles(FilenameFilter filter)
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
	private static final String FILE_EXTENSION = ".txt";

	public static void main(String[] args) throws IOException, ParseException
	{
		FileDemo fileDemo = new FileDemo();
		fileDemo.findAndListOutFiles(DIRECTORY_NAME, FILE_EXTENSION);
	}

	public void findAndListOutFiles(String dirName, String fileExtension)
	{
		File fileDir = new File(dirName);

		ExtensionFilter extFilter = new ExtensionFilter(fileExtension);

		/*
		 * Returns an array of abstract pathnames denoting
		 * the files and directories in the directory
		 * denoted by this abstract pathname that satisfy
		 * the specified filter.
		 */
		File[] listOfFiles = fileDir.listFiles(extFilter);

		if (listOfFiles.length == 0)
		{
			System.out.println("No files end with : " + FILE_EXTENSION);
			return;
		}

		for (File file : listOfFiles)
		{
			boolean isDeleted = file.delete();
			System.out.println(file.getAbsolutePath() + " isDeleted = "
					+ isDeleted);
		}
	}

}
