import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
List of objects -> List of String
Get all the name values from a list of the SoftwareEngineer objects.
*/

public class StreamDemo
{
	public static void main(String[] args)
	{

		List<SoftwareEngineer> softwareEngineerList = Arrays.asList(
				new SoftwareEngineer("Ram", 30, 10000),
				new SoftwareEngineer("Peter", 27, 20000),
				new SoftwareEngineer("Jai", 33, 30000));

		// Before Java 8
		List<String> nameList = new ArrayList<String>();
		for (SoftwareEngineer softwareEngineer : softwareEngineerList)
		{
			nameList.add(softwareEngineer.getName());
		}
		System.out.println(nameList);

		// Java 8
		List<String> collectNameList = softwareEngineerList.stream()
												.map(softwareEngineer -> softwareEngineer.getName())
												.collect(Collectors.toList());
		System.out.println(collectNameList);

	}

}