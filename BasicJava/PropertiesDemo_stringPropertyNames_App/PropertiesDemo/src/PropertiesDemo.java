import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * public Set<String> stringPropertyNames()
 * 
 * Returns: 
 * --------
 * 
 * a set of keys in this property list where the key and
 * its corresponding value are strings, including the
 * keys in the default property list.
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
			 * Returns a set of keys in this property list
			 * where the key and its corresponding value are
			 * strings, including distinct keys in the
			 * default property list if a key of the same
			 * name has not already been found from the main
			 * properties list.
			 */
			Set<String> set = p.stringPropertyNames();

			Iterator<String> itr = set.iterator();

			while (itr.hasNext())
			{
				String key = (String) itr.next();
				String value = p.getProperty(key);
				System.out.println("Key = " + key + " , Value = " + value);
			}

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