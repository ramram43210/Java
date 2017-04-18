import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Terminal operations return a result of a certain type instead of
 * again a Stream.
 *
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		/*
		 * This method helps in iterating over all elements of a
		 * stream and perform some operation on each of them. The
		 * operation is passed as lambda expression parameter.
		 */
		memberNames.forEach(System.out::println);
	}
}