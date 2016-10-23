import java.io.File;

public class FileDemo
{
	private static final String DIRECTORY_NAME = "D:/work";

	public static void main(String[] args)
	{
		FileDemo fileDemo = new FileDemo();
		fileDemo.deleteFiles(DIRECTORY_NAME);
	}

	public void deleteFiles(String dirName)
	{
		File fileDir = new File(dirName);
		File[] listOfFiles = fileDir.listFiles();
		for (File file : listOfFiles)
		{
			boolean isDeleted = file.delete();
			System.out.println(file.getAbsolutePath() + " isDeleted = "
															+ isDeleted);
		}

	}

}
