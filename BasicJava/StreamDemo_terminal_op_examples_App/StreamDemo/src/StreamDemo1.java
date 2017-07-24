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
		List<String> nameList = new ArrayList<>();
		nameList.add("Amitabh");
		nameList.add("Shekhar");
		nameList.add("Aman");
		nameList.add("Rahul");
		nameList.add("Shahrukh");
		nameList.add("Salman");
		nameList.add("Yana");
		nameList.add("Lokesh");

		/*
		 * This method helps in iterating over all elements of a
		 * stream and perform some operation on each of them. The
		 * operation is passed as lambda expression parameter.
		 */
		nameList.forEach(System.out::println);
	}
}