import java.util.Hashtable;

/*
 * Example of put(K key,V value) method.
 */
public class HashtableExample
{
	public static void main(String[] args)
	{

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		/*
		 * Key = CountryCode,Value = CountryName.
		 * 
		 * Maps the specified key to the specified value in this hashtable.
		 * 
		 * Neither the key nor the value can be null. The value can be retrieved
		 * by calling the get method with a key that is equal to the original
		 * key.
		 * 
		 * Returns: the previous value of the specified key in this hashtable,
		 * or null if it did not have one
		 */
		String value = hashtable.put("AF", "AFGHAN");

		System.out.println("hashtable : " + hashtable);

		System.out.println("Previous value associated with key 'AF' : " + value
				+ "\n");

		value = hashtable.put("AF", "AFGHANISTAN");

		System.out.println("hashtable : " + hashtable);

		System.out
				.println("Previous value associated with key 'AF' : " + value);

	}
}
