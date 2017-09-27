import java.util.ArrayList;
import java.util.List;
/**
 * Generate Streams from Collections.
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<String> itemList = new ArrayList<>();
		itemList.add("Apple");
		itemList.add("Ball");
		itemList.add("Cat");
		itemList.add("Dog");

		itemList.stream().forEach(item -> System.out.println(item));
	}

}