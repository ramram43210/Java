import java.util.TreeMap;

/*
 * Example of ceilingKey(K key) method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(10, "Cat");
		treeMap.put(50, "Dog");
		treeMap.put(30, "Apple");
		treeMap.put(40, "Ball");
		treeMap.put(20, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns the least key greater than or equal to the given key, or null
		 * if there is no such key.
		 */
		Integer key = treeMap.ceilingKey(24);

		System.out.println("ceilingKey(24) : " + key);
		
		key = treeMap.ceilingKey(20);

		System.out.println("ceilingKey(20) : " + key);
		
		
		key = treeMap.ceilingKey(54);

		System.out.println("ceilingKey(54) : " + key);

	}
}
