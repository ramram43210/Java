import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamSortedDemo
{
	public static void main(String[] args)
	{

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ball");
		map.put(2, "Cat");
		map.put(3, "Apple");
		map.put(4, "Dog");

		/*
		 * sorted() : It returns a stream sorted with given
		 * Comparator.
		 */
		System.out.println("---Sort by Map Value---");
		map.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getValue))
				.forEach(e -> System.out.println("Key: " + e.getKey()
						+ ", Value: " + e.getValue()));
	}
}