import java.util.Hashtable;
import java.util.TreeMap;

/*
 * Example of putAll(Map<? extends K,? extends V> t) method.
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

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		/*
		 * Copies all of the mappings from the specified map to this hashtable.
		 * These mappings will replace any mappings that this hashtable had for
		 * any of the keys currently in the specified map.
		 */

		hashtable.putAll(treeMap);

		System.out.println("hashtable : " + hashtable + "\n");

	}
}
