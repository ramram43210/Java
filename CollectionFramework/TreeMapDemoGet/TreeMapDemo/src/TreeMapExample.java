import java.util.TreeMap;

/*
 * Example of get(Object key) method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Cat");
		treeMap.put(2, "Dog");
		treeMap.put(4, "Apple");
		treeMap.put(3, "Ball");

		System.out.println("treeMap : " + treeMap +"\n");

		/*
		 * Returns the value to which the specified key is mapped, or null if
		 * this map contains no mapping for the key.
		 * 
		 * A return value of null does not necessarily indicate that the map
		 * contains no mapping for the key; it's also possible that the map
		 * explicitly maps the key to null. The containsKey operation may be
		 * used to distinguish these two cases.
		 */
		String value = treeMap.get(2);

		System.out.println("value for the Key '2' : " + value);

		value = treeMap.get(10);

		System.out.println("value for the Key '10' : " + value);

	}
}
