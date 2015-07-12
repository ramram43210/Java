import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableFailFastExample
{
	public static void main( String[] args )
	{

		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

		hashtable.put(1, "Apple");
		hashtable.put(2, "Ball");
		hashtable.put(3, "Cat");

		System.out.println("hashtable : " + hashtable);

		/*
		 * Enumeration in the Hashtable is not fail-fast because it won't Throw
		 * ConcurrentModificationException if we modifies the hashtable
		 * structurally by adding or removing any element.
		 */

		Enumeration<Integer> enumeration = hashtable.keys();

		while( enumeration.hasMoreElements() )
		{
			Integer key = enumeration.nextElement();
			System.out.println(key);
			hashtable.put(4,"Dove");
		}

		System.out.println("hashtable : " + hashtable);
	}
}
