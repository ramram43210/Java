import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo
{

	public static void main(String[] args) throws IOException

	{
		FileOutputStream fileOutputStream = null;
		PrintStream printStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("myfile.txt");
			printStream = new PrintStream(fileOutputStream);
			printStream.println(2500);
			printStream.println("Hello Peter");
			printStream.println(25.988);
			printStream.println(true);
			printStream.close();
			printStream.close();
		}
		finally
		{
			if (fileOutputStream != null)
			{
				fileOutputStream.close();
			}
			if (printStream != null)
			{
				printStream.close();
			}
		}

	}
}
