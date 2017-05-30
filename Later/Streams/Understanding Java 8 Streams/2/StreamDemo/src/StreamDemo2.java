import java.util.ArrayList;
import java.util.List;
/**
 * Generate Streams from Collections.
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<String> itemsList = new ArrayList<>();
		itemsList.add("Apple");
		itemsList.add("Ball");
		itemsList.add("Cat");
		itemsList.add("Dog");

		itemsList.stream().forEach(item -> System.out.println(item));
	}

}