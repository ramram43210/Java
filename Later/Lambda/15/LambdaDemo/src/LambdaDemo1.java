import java.util.ArrayList;
import java.util.List;

public class LambdaDemo1
{

	public static void main(String[] args)
	{

		List<String> nameList = new ArrayList<>();
		nameList.add("Peter");
		nameList.add("John");
		nameList.add("Juli");
		nameList.add("Stephan");

		/*
		 * Normal way to loop a Map.
		 */
		for (String name : nameList)
		{
			System.out.println(name);
		}

		System.out.println("------------------------------------");

		/*
		 * In Java 8, we can loop a List with forEach + lambda
		 * expression or method reference.
		 */
		nameList.forEach(name -> System.out.println(name));

	}

}
