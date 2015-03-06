import java.util.Hashtable;

/*
 * Example of remove(Object key) method.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		/*
		 * Key = CountryCode,Value = CountryName
		 */
		hashtable.put("AF", "AFGHANISTAN");
		hashtable.put("BE", "BELGIUM");
		hashtable.put("US", "UNITED STATES");
		hashtable.put("IN", "INDIA");

		System.out.println("hashtable : " + hashtable + "\n");

		/*
		 * Removes the key (and its corresponding value) from this hashtable.
		 * 
		 * This method does nothing if the key is not in the hashtable.
		 */

		String value = hashtable.remove("US");

		System.out.println("value : " + value + "\n");
		System.out.println("hashtable : " + hashtable + "\n");

	}
}
