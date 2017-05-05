import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String[] args)
	{
		GenericDemo genericDemo = new GenericDemo();
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(100);
		numberList.add(200);
		genericDemo.processElements(numberList);
		
		System.out.println("--------------------------------");
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Peter");
		nameList.add("Ram");
		genericDemo.processElements(nameList);

	}

	public void processElements(List<?> list)
	{
		for (Object o : list)
		{
			System.out.println(o);
		}
	}

}
