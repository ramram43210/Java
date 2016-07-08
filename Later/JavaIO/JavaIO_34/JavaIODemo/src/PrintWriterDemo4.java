import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo4
{

	public static void main(String[] args) throws IOException

	{
		FileOutputStream fileOutputStream = null;
		PrintWriter printWriter = null;
		try
		{
			fileOutputStream = new FileOutputStream("myoutputfile4.txt");
			printWriter = new PrintWriter(fileOutputStream);
			printWriter.println(true);
			printWriter.println((int) 123);
			printWriter.println((float) 123.456);
			int intValue = 98;
			double doubleValue = 899.87;
			printWriter.printf("i = %d and k = %f", intValue,
					doubleValue);
			printWriter.flush();
			System.out
			.println("Successfully written to the file."
					+ "please check the file \'myoutputfile4.txt\'");
			

		}
		finally
		{
			if (fileOutputStream != null)
			{
				fileOutputStream.close();
			}
			if (printWriter != null)
			{
				printWriter.close();
			}
		}

	}
}
