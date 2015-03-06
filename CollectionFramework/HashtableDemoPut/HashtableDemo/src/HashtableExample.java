import java.util.Hashtable;

/*
 * Example of put(K key,V value) method.
 */
public class HashtableExample
{
	public static void main(String[] args)
	{

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		System.out.println("hashtable : " + hashtable + "\n");

		/*
		 * Key = CountryCode,Value = CountryName.
		 * 
		 * Maps the specified key to the specified value in this hashtable.
		 * 
		 * Neither the key nor the value can be null. The value can be retrieved
		 * by calling the get method with a key that is equal to the original
		 * key.
		 */
		hashtable.put("AF", "AFGHANISTAN");
		hashtable.put("BE", "BELGIUM");
		hashtable.put("US", "UNITED STATES");

		System.out.println("hashtable : " + hashtable);

	}
}
