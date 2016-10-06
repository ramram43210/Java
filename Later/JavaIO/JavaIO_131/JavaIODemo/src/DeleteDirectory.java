import java.io.File;
import java.io.IOException;

public class DeleteDirectory
{

	private static final String SRC_FOLDER = "D:/work/java";

	public static void main(String[] args) throws IOException
	{

		File file = new File(SRC_FOLDER);
		/*
		 * make sure directory exists
		 */
		if (!file.exists())
		{
			System.out.println("Directory does not exist.");
		}
		else
		{
			DeleteDirectory deleteDirectory = new DeleteDirectory();
			deleteDirectory.deleteDir(file);
		}

	}

	public void deleteDir(File file) throws IOException
	{

		if (file.isDirectory())
		{

			/*
			 * If directory is empty, then delete it
			 */
			if (file.list().length == 0)
			{
				deleteEmptyDir(file);
			}
			else
			{
				// list all the directory contents
				File files[] = file.listFiles();

				for (File fileDelete : files)
				{
					/*
					 * Recursive delete
					 */
					deleteDir(fileDelete);
				}

				/*
				 * check the directory again, if empty then 
				 * delete it.
				 */
				if (file.list().length == 0)
				{
					deleteEmptyDir(file);
				}
			}

		}
		else
		{
			/*
			 * if file, then delete it
			 */
    		file.delete();
    		System.out.println("File is deleted : " + file.getAbsolutePath());
		}
	}

	private void deleteEmptyDir(File file)
	{
		file.delete();
		System.out.println("Directory is deleted : " + file.getAbsolutePath());
	}

}
