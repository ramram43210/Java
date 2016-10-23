import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("D:/work/myfile.txt");

		/*
		 * Returns the time that the file denoted by this
		 * abstract pathname was last modified.
		 * 
		 * Returns: A long value representing the time the
		 * file was last modified, measured in milliseconds
		 * since the epoch (00:00:00 GMT, January 1, 1970),
		 * or 0L if the file does not exist or if an I/O
		 * error occurs
		 */
		long lastModified = file.lastModified();
		System.out.println("Before Format : " + lastModified);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
												"MM/dd/yyyy HH:mm:ss");

		String formatedStr = simpleDateFormat.format(lastModified);
		System.out.println("After Format : " + formatedStr);
	}

}
