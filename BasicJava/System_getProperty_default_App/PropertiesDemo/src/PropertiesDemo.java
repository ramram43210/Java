/*
 * public static String getProperty(String key, String
 * 												 def)
 * 
 * Parameters: 
 * ----------
 * 
 * key - the name of the system property.  
 * def - a default value.
 */

public class PropertiesDemo
{

	public static void main(String[] args)
	{
		/*
		 * Gets the system property indicated by the
		 * specified key.if not present it will return
		 * default value.
		 */
		String value1 = System.getProperty("a.b", "hello");
		System.out.println("value1 = " + value1);

		
		String value2 = System.getProperty("os.name", "hello");
		System.out.println("value2 = " + value2);
		
	}
}