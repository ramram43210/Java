import java.util.Vector;

/*
 * Example of Vector(int initialCapacity, int capacityIncrement) constructor.
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<String> vector = new Vector<String>(5, 2);
		vector.add("Dave");
		vector.add("Peter");
		vector.add("Phil");
		vector.add("Rohit");
		vector.add("Virat");

		System.out.println("vector : " + vector);
		System.out.println("vector size: " + vector.size());
		System.out.println("vector capacity: " + vector.capacity() + "\n");

		vector.add("Raj");

		System.out.println("vector : " + vector);
		System.out.println("vector size: " + vector.size());
		System.out.println("vector capacity: " + vector.capacity() + "\n");

	}
}
