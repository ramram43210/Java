import java.util.Hashtable;

/*
 * Example of clone() method.
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
		 * Creates a shallow copy of this hashtable. All the structure of the
		 * hashtable itself is copied, but the keys and values are not cloned.
		 * This is a relatively expensive operation.
		 */
		Object object = hashtable.clone();

		System.out
		        .println("Object class name : " + object.getClass().getName() +  "\n");

		Hashtable<String, String> clonedHashtable = (Hashtable<String, String>) object;

		System.out.println("Cloned Hashtable : " + clonedHashtable);

	}
}
