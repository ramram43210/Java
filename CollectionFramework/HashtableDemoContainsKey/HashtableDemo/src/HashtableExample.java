import java.util.Hashtable;

/*
 * Example of containsKey(Object key) method.
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
		 * Returns true if this map contains a mapping for the specified key.
		 */
		boolean isKeyExist = hashtable.containsKey("BE");

		System.out.println("isKey 'BE' Exist : " + isKeyExist);

		isKeyExist = hashtable.containsKey("EG");

		System.out.println("isKey 'EG' Exist : " + isKeyExist);

	}
}
