import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String[] args)
	{
		List<String> nameList = new ArrayList<String>();
		nameList.add("Peter");
		nameList.add("Ram");
		printData(nameList);
		
		System.out.println("--------------------------");
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(2);
		integerList.add(3);
		integerList.add(5);
		printData(integerList);

	}

	public static void printData(List<?> list)
	{
		for (Object obj : list)
		{
			System.out.println(obj);
		}
	}

}
