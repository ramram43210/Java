import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo
{
	public static void main(String[] args)
	{
		List<String> namesList = Arrays.asList("Ram", "Peter","Pradeep", "Steve");

		List<String> filteredNameList = getFilterOutput(namesList, "P");
		for (String name : filteredNameList)
		{
			System.out.println(name); 
		}
	}

	private static List<String> getFilterOutput(List<String> namesList, String filter)
	{
		List<String> filteredNameList = new ArrayList<>();
		for (String name : namesList)
		{
			if (name.startsWith("P"))
			{
				filteredNameList.add(name);
			}
		}
		return filteredNameList;
	}
}