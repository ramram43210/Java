import java.util.Hashtable;
import java.util.TreeMap;

/*
 * Example of Hashtable(Map<? extends K,? extends V> t) Constructor.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		TreeMap<String, String> treeMap = new TreeMap<String, String>();

		treeMap.put("AF", "AFGHANISTAN");
		treeMap.put("BE", "BELGIUM");
		treeMap.put("US", "UNITED STATES");
		treeMap.put("IN", "INDIA");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Constructs a new hashtable with the same mappings as the given Map.
		 * The hashtable is created with an initial capacity sufficient to hold
		 * the mappings in the given Map and a default load factor (0.75).
		 */
		Hashtable<String, String> hashtable = new Hashtable<String, String>(
		        treeMap);

		System.out.println("hashtable : " + hashtable + "\n");

	}
}
