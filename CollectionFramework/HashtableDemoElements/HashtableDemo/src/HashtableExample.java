import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Example of elements() method.
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
		 * Returns an enumeration of the values in this hashtable.
		 * 
		 * Use the Enumeration methods on the returned object to fetch the
		 * elements sequentially.
		 */
		Enumeration<String> enumeration = hashtable.elements();

		/*
		 * Tests if this enumeration contains more elements.
		 */
		while( enumeration.hasMoreElements() )
		{
			/*
			 * Returns the next element of this enumeration if this enumeration
			 * object has at least one more element to provide.
			 */
			String value = enumeration.nextElement();

			System.out.println(value);

		}

	}
}
