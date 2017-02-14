import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * public String getProperty(String key, String
 * 										defaultValue)
 * 
 * Parameters: 
 * ----------
 * 
 * key - the hashtable key. 
 * 
 * defaultValue - a default value.
 * 
 * Returns: 
 * -------
 * 
 * the value in this property list with the specified
 * key value.
 */

class PropertiesDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = null;
		try
		{
			fileReader = new FileReader("db.properties");

			Properties p = new Properties();
			/*
			 * Reads a property list (key and element pairs)
			 * from the input character stream in a simple
			 * line-oriented format.
			 */
			p.load(fileReader);

			/*
			 * Searches for the property with the specified
			 * key in this property list. If the key is not
			 * found in this property list, the default
			 * property list, and its defaults, recursively,
			 * are then checked. The method returns the
			 * default value argument if the property is not
			 * found.
			 */

			String user = p.getProperty("user", "system");
			String password = p.getProperty("password", "Oracle");

			System.out.println("user = "+user);
			System.out.println("password = "+password);
		}
		finally
		{
			if (fileReader != null)
			{
				fileReader.close();
			}
		}
	}
}