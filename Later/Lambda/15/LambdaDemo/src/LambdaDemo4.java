import java.util.ArrayList;
import java.util.List;

public class LambdaDemo4
{

	public static void main(String[] args)
	{

		List<String> nameList = new ArrayList<>();
		nameList.add("Peter");
		nameList.add("John");
		nameList.add("Juli");
		nameList.add("Stephan");

		/*
		 * In Java 8, we can loop a List with forEach + lambda
		 * expression or method reference.
		 */

		//Stream and filter
		nameList.stream()
			.filter(name->name.contains("Juli"))
			.forEach(System.out::println);
	}

}
