import java.util.TreeMap;

/*
 * Example of floorKey(K key) method.
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
		 * Returns the greatest key less than or equal to the given key, or null
		 * if there is no such key.
		 */
		Integer key = treeMap.floorKey(24);

		System.out.println("floorKey(24) : " + key);
		
		key = treeMap.floorKey(30);

		System.out.println("floorKey(30) : " + key);

		key = treeMap.floorKey(8);

		System.out.println("floorKey(8) : " + key);

	}
}
