import java.util.TreeMap;

/*
 * Example of clone() method.
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
		 * Returns a shallow copy of this TreeMap instance. (The keys and values
		 * themselves are not cloned.)
		 */
		Object object = treeMap.clone();

		System.out
		        .println("Object class name : " + object.getClass().getName());

		TreeMap<Integer, String> clonedTreeMap = (TreeMap<Integer, String>) object;

		System.out.println("cloned TreeMap : " + clonedTreeMap);

	}
}
