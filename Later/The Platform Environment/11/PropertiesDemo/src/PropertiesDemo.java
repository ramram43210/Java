import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/*
 * public void list(PrintWriter out)
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

			PrintWriter writer = new PrintWriter(System.out);
			/*
			 * print the list with a PrintWriter object
			 */
			p.list(writer);

			/*
			 * flush the stream
			 */
			writer.flush();

		}

	}
}