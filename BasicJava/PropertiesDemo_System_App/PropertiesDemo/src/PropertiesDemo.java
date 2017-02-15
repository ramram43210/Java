import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class PropertiesDemo
{

	public static void main(String[] args) throws IOException
	{

		/*
		 * Returns the system properties
		 */
		Properties p = System.getProperties();

		/*
		 * Returns a set of keys in this property list where
		 * the key and its corresponding value are strings,
		 * including distinct keys in the default property
		 * list if a key of the same name has not already
		 * been found from the main properties list.
		 */
		Set<String> set = p.stringPropertyNames();

		Iterator<String> itr = set.iterator();

		while (itr.hasNext())
		{
			String key = (String) itr.next();
			/*
			 * Gets the system property indicated by the
			 * specified key.
			 */
			String value = p.getProperty(key);
			System.out.println(key + " = " + value);
		}

	}
}