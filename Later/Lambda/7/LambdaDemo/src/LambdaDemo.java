import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Java Lambda Expression Example: For-each Loop
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		List<String> nameList = new ArrayList<String>();
		nameList.add("Ram");
		nameList.add("Peter");
		nameList.add("John");

		nameList.forEach((name) -> System.out.println(name));
	}

}
