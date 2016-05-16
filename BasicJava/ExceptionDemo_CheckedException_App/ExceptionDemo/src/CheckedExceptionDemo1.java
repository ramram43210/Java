import java.io.FileInputStream;

/*
 * Checked exceptions gets checked during compile time.
 * Since we didn’t handled/declared the exceptions, our
 * program gave the compilation error.
 */

public class CheckedExceptionDemo1
{

	public static void main(String[] args)
	{
		FileInputStream fis = null;

		/*
		 * This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception
		 */
		fis = new FileInputStream("./myfile.txt");
		int i;

		/*
		 * Method read() of FileInputStream class also
		 * throws a checked exception: IOException
		 */
		while ((i = fis.read()) != -1)
		{
			System.out.print((char) i);
		}

		/*
		 * The method close() closes the file input stream
		 * It throws IOException
		 */
		fis.close();
	}

}
