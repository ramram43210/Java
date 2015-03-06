import java.util.Hashtable;

/*
 * Example of contains(Object value) method.
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
		 * Tests if some key maps into the specified value in this hashtable.
		 * 
		 * This operation is more expensive than the containsKey method. Note
		 * that this method is identical in functionality to containsValue,
		 * (which is part of the Map interface in the collections framework).
		 */
		boolean isValueExist = hashtable.contains("BELGIUM");

		System.out.println("isValue 'BELGIUM' Exist : " + isValueExist);

		isValueExist = hashtable.contains("PAKISTAN");

		System.out.println("isValue 'PAKISTAN' Exist : " + isValueExist);

	}
}
