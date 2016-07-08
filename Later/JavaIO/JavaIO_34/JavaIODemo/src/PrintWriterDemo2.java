import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2
{

	public static void main(String[] args) throws IOException

	{
		PrintWriter printWriter = null;
		try
		{
			String fileLocation = "myoutputfile2.txt";
			printWriter = new PrintWriter(fileLocation);
			printWriter.println(true);
			printWriter.println((int) 123);
			printWriter.println((float) 123.456);
			int intValue = 98;
			double doubleValue = 899.87;
			printWriter.printf("i = %d and k = %f", intValue,
					doubleValue);
			System.out
			.println("Successfully written to the file."
					+ "please check the file \'myoutputfile2.txt\'");
		}
		finally
		{

			if (printWriter != null)
			{
				printWriter.close();
			}
		}

	}
}
