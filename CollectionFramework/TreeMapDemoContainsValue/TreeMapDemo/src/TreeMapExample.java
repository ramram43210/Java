import java.util.TreeMap;

/*
 * Example of containsValue(Object value) method.
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
		 * Returns true if this map maps one or more keys to the specified
		 * value.
		 */
		boolean isValueExist = treeMap.containsValue("Ball");

		System.out.println("isValue 'Ball' Exist : " + isValueExist);

		isValueExist = treeMap.containsValue("Eagle");

		System.out.println("isValue 'Eagle' Exist : " + isValueExist);

	}
}
