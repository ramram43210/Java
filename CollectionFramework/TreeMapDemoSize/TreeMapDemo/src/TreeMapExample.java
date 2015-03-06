import java.util.TreeMap;

/*
 * Example of size() method.
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

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns the number of key-value mappings in this map.
		 */
		int size = treeMap.size();

		System.out.println("size : " + size);

	}
}
