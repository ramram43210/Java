import java.util.TreeMap;

/*
 * Example of clear() method.
 */
public class TreeMapExample
{
	public static void main(String[] args)
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Cat");
		treeMap.put(2, "Dog");
		treeMap.put(4, "Apple");
		treeMap.put(3, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Removes all of the mappings from this map. The map will be empty
		 * after this call returns.
		 */
		treeMap.clear();

		System.out.println("treeMap : " + treeMap);

	}
}
