import java.util.Hashtable;

/*
 * Example of containsValue(Object value) method.
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
		 * Returns true if this hashtable maps one or more keys to this value.
		 * 
		 * Note that this method is identical in functionality to contains
		 * (which predates the Map interface).
		 */
		boolean isValueExist = hashtable.containsValue("INDIA");

		System.out.println("isValue 'INDIA' Exist : " + isValueExist);

		isValueExist = hashtable.containsValue("Colombia");

		System.out.println("isValue 'Colombia' Exist : " + isValueExist);

	}
}
