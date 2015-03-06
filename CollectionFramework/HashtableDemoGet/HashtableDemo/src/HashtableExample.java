import java.util.Hashtable;

/*
 * Example of get(Object key) method.
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
		 * Returns the value to which the specified key is mapped, or null if
		 * this map contains no mapping for the key.
		 */
		
		String value = hashtable.get("US");

		System.out.println("value for the Key 'US' : " + value);

		value = hashtable.get("PA");

		System.out.println("value for the Key 'PA' : " + value);

	}
}
