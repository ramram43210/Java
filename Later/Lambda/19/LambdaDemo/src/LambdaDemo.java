import java.util.ArrayList;
import java.util.List;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<String> nameList = new ArrayList<>();
		nameList.add("Peter");
		nameList.add("John");
		nameList.add("Juli");
		nameList.add("Stephan");

		// method reference
		nameList.forEach(System.out::println);

	}

}
