import java.util.Hashtable;

/*
 * Example of default Hashtable() Constructor.
 */
public class HashtableExample
{
	public static void main(String[] args)
	{

		/*
		 * Constructs a new, empty hashtable with a default initial capacity
		 * (11) and load factor (0.75).
		 */
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

		System.out.println("hashtable : " + hashtable + "\n");

		hashtable.put(1, "Apple");
		hashtable.put(2, "Ball");
		hashtable.put(3, "Cat");

		System.out.println("hashtable : " + hashtable);
	}
}
