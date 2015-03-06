import java.util.TreeMap;

/*
 * Example of containsKey(Object key) method.
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
		 * Returns true if this map contains a mapping for the specified key.
		 */
		boolean isKeyExist = treeMap.containsKey(2);

		System.out.println("isKey '2' Exist : " + isKeyExist);

		isKeyExist = treeMap.containsKey(8);

		System.out.println("isKey '8' Exist : " + isKeyExist);

	}
}
