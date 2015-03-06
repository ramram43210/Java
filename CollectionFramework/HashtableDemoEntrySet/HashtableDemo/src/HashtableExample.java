import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * Example of entrySet() method.
 */
public class HashtableExample
{
	public static void main(String[] args)
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
		 * A map entry (key-value pair).
		 * 
		 * Returns a Set view of the mappings contained in this map.
		 */
		Set<Map.Entry<String, String>> entrySet = hashtable.entrySet();

		System.out.println("entrySet : " + entrySet + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" + " | " + "value");
		System.out.println("-----------------------");

		for (Map.Entry<String, String> entry : entrySet)
		{
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "   | " + value);
		}
	}
}
