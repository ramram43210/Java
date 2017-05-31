import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo
{
	public static void main(String[] args)
	{

		List<String> nameList = new ArrayList<>();
		nameList.add("Peter");
		nameList.add("John");
		nameList.add("Juli");
		nameList.add("Stephan");

		nameList.forEach(name -> System.out.println(name));
		
		System.out.println("------------------------");
		
		// method reference
		nameList.forEach(System.out::println);
	}

}
