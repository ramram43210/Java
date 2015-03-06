import java.util.TreeMap;

/*
 * Example of isEmpty() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		System.out.println("treeMap : " + treeMap);

		/*
		 * Returns true if this map contains no key-value mappings.
		 */
		boolean isEmpty = treeMap.isEmpty();

		System.out.println("isEmpty : " + isEmpty + "\n");

		treeMap.put(1, "Cat");
		treeMap.put(2, "Dog");
		treeMap.put(4, "Apple");
		treeMap.put(3, "Ball");

		System.out.println("treeMap : " + treeMap );

		isEmpty = treeMap.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

	}
}
