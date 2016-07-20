import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
		fileReadWriteDemo.readAndWriteFile();
	}

	private void readAndWriteFile() throws IOException
	{
		FileReader fileReader = null;
		FileWriter fileWritter = null;

		try
		{
			fileReader = new FileReader("myinputfile.txt");
			fileWritter = new FileWriter("myoutputfile.txt");

			int c;
			while ((c = fileReader.read()) != -1)
			{
				fileWritter.write(c);
			}
			System.out
					.println("Successfully read from "
							+ "\'myinputfile.txt\' and written "
							+ "to \'myoutputfile.txt\'");
		}
		finally
		{
			if (fileReader != null)
			{
				fileReader.close();
			}
			if (fileWritter != null)
			{
				fileWritter.close();
			}
		}
	}

}
