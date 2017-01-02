import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * public void list(PrintStream out)
 * 
 * Parameters:
 * ----------
 * 
 * out - an output stream.
 */
class PropertiesDemo
{

	public static void main(String[] args) throws IOException
	{

		try (FileReader fileReader = new FileReader("db.properties");)
		{

			Properties p = new Properties();
			/*
			 * Reads a property list (key and element pairs)
			 * from the input character stream in a simple
			 * line-oriented format.
			 */
			p.load(fileReader);

			/*
			 * Prints this property list out to the
			 * specified output stream.This method is useful
			 * for debugging.
			 */
			p.list(System.out);

		}

	}
}