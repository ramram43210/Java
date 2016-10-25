import java.io.File;

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

	public static void main(String[] args)
	{
		FileDemo fileDemo = new FileDemo();
		fileDemo.deleteFiles("D:/work", ".txt");
	}

	public void deleteFiles(String dirName, String fileExtension)
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
			System.out.println("No files end with : " + fileExtension);
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
