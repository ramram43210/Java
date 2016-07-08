import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1
{

	public static void main(String[] args) throws IOException

	{
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try
		{
			fileWriter = new FileWriter("myoutputfile1.txt");
			printWriter = new PrintWriter(fileWriter);
			printWriter.println(true);
			printWriter.println((int) 123);
			printWriter.println((float) 123.456);
			int intValue = 98;
			double doubleValue = 899.87;
			printWriter.printf("i = %d and k = %f", intValue,
					doubleValue);
			System.out
					.println("Successfully written to the file."
							+ "please check the file \'myoutputfile1.txt\'");

		}
		finally
		{
			if (fileWriter != null)
			{
				fileWriter.close();
			}
			if (printWriter != null)
			{
				printWriter.close();
			}
		}

	}
}
