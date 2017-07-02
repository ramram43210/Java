import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<String> namesList = Arrays.asList("Ram", "Peter","Pradeep", "Steve");

		
		List<String> filteredNameList = namesList.stream() //convert list to stream
				.filter(name -> name.startsWith("P")) //filters the name, starts with "P".
				.collect(Collectors.toList()); //collect the output and convert streams to a List
		

		filteredNameList.forEach(System.out::println);
	}

}