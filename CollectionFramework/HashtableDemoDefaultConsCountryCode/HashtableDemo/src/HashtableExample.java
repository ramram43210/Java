import java.util.Hashtable;

/*
 * Example of default Hashtable() Constructor.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		/*
		 * Constructs a new, empty hashtable with a default initial capacity
		 * (11) and load factor (0.75).
		 */
		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		System.out.println("hashtable : " + hashtable + "\n");

		/*
		 * Key = CountryCode,Value = CountryName
		 */
		hashtable.put("AF", "AFGHANISTAN");
		hashtable.put("BE", "BELGIUM");
		hashtable.put("US", "UNITED STATES");
		hashtable.put("IN", "INDIA");

		System.out.println("hashtable : " + hashtable);
	}
}
