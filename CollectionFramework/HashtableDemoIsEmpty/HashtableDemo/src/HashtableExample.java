import java.util.Hashtable;

/*
 * Example of isEmpty() method.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		System.out.println("hashtable : " + hashtable);

		/*
		 * Tests if this hashtable maps no keys to values.
		 */
		boolean isEmpty = hashtable.isEmpty();

		System.out.println("isEmpty : " + isEmpty + "\n");

		/*
		 * Key = CountryCode,Value = CountryName
		 */
		hashtable.put("AF", "AFGHANISTAN");
		hashtable.put("BE", "BELGIUM");
		hashtable.put("US", "UNITED STATES");
		hashtable.put("IN", "INDIA");

		System.out.println("hashtable : " + hashtable);

		isEmpty = hashtable.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

	}
}
