import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/*
 * public Enumeration<?> propertyNames()
 *  
 * Returns: 
 * --------
 * 
 * an enumeration of all the keys in this property list,
 * including the keys in the default property list.
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
			 * Returns an enumeration of all the keys in
			 * this property list, including distinct keys
			 * in the default property list if a key of the
			 * same name has not already been found from the
			 * main properties list.
			 */
			Enumeration<?> enumeration = p.propertyNames();

			while (enumeration.hasMoreElements())
			{
				String key = (String) enumeration.nextElement();
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