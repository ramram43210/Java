import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Example of keys() method.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		/*
		 * Key = CountryCode,Value = CountryName.
		 */
		hashtable.put("AF", "AFGHANISTAN");
		hashtable.put("BE", "BELGIUM");
		hashtable.put("US", "UNITED STATES");
		hashtable.put("IN", "INDIA");

		System.out.println("hashtable : " + hashtable + "\n");

		/*
		 * Returns an enumeration of the keys in this hashtable.
		 */
		Enumeration<String> enumeration = hashtable.keys();

		
		System.out.println("key");
		System.out.println("-----");
		
		/*
		 * Tests if this enumeration contains more elements.
		 */
		while( enumeration.hasMoreElements() )
		{
			/*
			 * Returns the next element of this enumeration if this enumeration
			 * object has at least one more element to provide.
			 */
			String key = enumeration.nextElement();
			System.out.println(key);

		}

	}
}
