import java.io.File;
import java.io.IOException;

public class DisplayDirectoryStructure
{

	private static final String SRC_FOLDER = "D:/work/java";

	public static void main(String[] args) throws IOException
	{

		File file = new File(SRC_FOLDER);

		DisplayDirectoryStructure displayDirectoryStructure = new DisplayDirectoryStructure();
		displayDirectoryStructure.displayDirStructure(file);

	}

	public void displayDirStructure(File file) throws IOException
	{

		System.out.println("Path = " + file.getAbsolutePath());

		if (file.isDirectory())
		{
			// list all the directory contents
			File files[] = file.listFiles();

			for (File displayFile : files)
			{
				/*
				 * Recursive call.
				 */
				displayDirStructure(displayFile);
			}
		}

	}

}
