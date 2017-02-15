/*
 * public static String getProperty(String key)
 *
 * Parameters:
 * ----------
 *
 * key - the name of the system property.
 */

public class PropertiesDemo
{

	public static void main(String[] args)
	{
		/*
		 * Gets the system property indicated by the
		 * specified key.
		 */
		String value = System.getProperty("os.name");
		System.out.println("value = " + value);

		String value1 = System.getProperty("a.b");
		System.out.println("value1 = " + value1);

	}
}