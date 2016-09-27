import java.io.File;
import java.io.IOException;
import java.text.ParseException;

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
		File[] listOfFiles = fileDir.listFiles();
		for (File file : listOfFiles)
		{
			boolean isDeleted = file.delete();
			System.out.println(file.getAbsolutePath() + " isDeleted = "
															+ isDeleted);
		}

	}

}
