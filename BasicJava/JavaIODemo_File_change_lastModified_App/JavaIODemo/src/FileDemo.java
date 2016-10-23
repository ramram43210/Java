import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FileDemo
{

	public static void main(String[] args) throws IOException, ParseException
	{
		File file = new File("D:/work/myfile.txt");

		long lastModified = file.lastModified();
		System.out.println("Before Format : " + lastModified);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"MM/dd/yyyy HH:mm:ss");

		String formatedStr = simpleDateFormat.format(lastModified);
		System.out.println("After Format,old lastModified : " + formatedStr);

		/*
		 * Sets the last-modified time of the file or
		 * directory named by this abstract pathname.
		 */
		file.setLastModified(System.currentTimeMillis());

		lastModified = file.lastModified();
		formatedStr = simpleDateFormat.format(lastModified);
		System.out.println("After Format,new lastModified : " + formatedStr);
	}

}
