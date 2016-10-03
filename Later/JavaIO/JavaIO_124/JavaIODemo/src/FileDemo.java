import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class FileDemo
{

	public static void main(String[] args) throws IOException, ParseException
	{
		File file = new File("D:/Git-Bit/Java/.git");

		/*
		 * Returns: true if and only if the file denoted by
		 * this abstract pathname is hidden according to the
		 * conventions of the underlying platform
		 */
		if (file.isHidden())
		{
			System.out.println("This file is hidden");
		}
		else
		{
			System.out.println("This file is not hidden");
		}
	}

}
