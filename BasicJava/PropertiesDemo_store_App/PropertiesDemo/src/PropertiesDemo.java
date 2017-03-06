import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * public void store(Writer writer, String comments)
 * 									throws IOException
 * 
 * Parameters: 
 * ----------
 * 
 * writer - an output character stream writer. 
 * comments - a description of the property list.
 */
class PropertiesDemo
{
	public static void main(String[] args) throws IOException
	{

		try (FileWriter fileWriter = new FileWriter("info.properties"))
		{

			Properties p = new Properties();
			p.setProperty("name", "Ram");
			p.setProperty("email", "ram@yahoo.com");

			/*
			 * Writes this property list (key and element
			 * pairs) in this Properties table to the output
			 * character stream in a format suitable for
			 * using the load(Reader) method.
			 */
			p.store(fileWriter, "User Info");

			System.out.println("Property file is created successfully..");
		}

	}
}