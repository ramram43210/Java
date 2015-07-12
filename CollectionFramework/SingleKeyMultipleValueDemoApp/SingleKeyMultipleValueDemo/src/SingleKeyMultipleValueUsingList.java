import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HashMap - Single Key and Multiple Values using List
 */
public class SingleKeyMultipleValueUsingList
{

	public static void main( String[] args )
	{

		HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

		// create list one and store values
		List<String> listOne = new ArrayList<String>();
		listOne.add("Apple");
		listOne.add("Aeroplane");

		// create list two and store values
		List<String> listTwo = new ArrayList<String>();
		listTwo.add("Bat");
		listTwo.add("Banana");

		// create list three and store values
		List<String> listThree = new ArrayList<String>();
		listThree.add("Cat");
		listThree.add("Car");

		// put values into hashMap
		hashMap.put("A", listOne);
		hashMap.put("B", listTwo);
		hashMap.put("C", listThree);

		System.out.println("hashMap : " + hashMap +"\n");
		
		// iterate and display values
		System.out
		        .println("Fetching Keys and corresponding [Multiple] Values \n");
		
		for( Map.Entry<String, List<String>> entry : hashMap.entrySet() )
		{
			String key = entry.getKey();
			List<String> values = entry.getValue();
			
			System.out.print("Key = " + key);
			System.out.println(" , Values = " + values );
		}
	}
}