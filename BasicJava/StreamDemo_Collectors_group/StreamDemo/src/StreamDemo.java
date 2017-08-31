import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Product> productList = Arrays.asList(
				new Product("potatoes", 15),
				new Product("orange", 15), new Product("lemon", 20),
				new Product("bread", 20), new Product("sugar", 30));

		/*
		 * Grouping of stream’s elements according to the specified
		 * function:
		 * 
		 * The stream was reduced to the Map which groups all products
		 * by their price.
		 */
		Map<Integer, List<Product>> map = productList.stream()
				.collect(Collectors.groupingBy(Product::getPrice));
		
		Set<Entry<Integer, List<Product>>> entrySet = map.entrySet();
		for (Entry<Integer, List<Product>> entry : entrySet)
		{
			System.out.println(entry.getKey() +" = "+entry.getValue());
		}
		
		System.out.println("---------------------------------------------------");

		/*
		 * Dividing stream’s elements into groups according to some
		 * predicate:
		 */
		Map<Boolean, List<Product>> partionedMap = productList
				.stream().collect(Collectors.partitioningBy(
						element -> element.getPrice() > 25));
		
		
		Set<Entry<Boolean, List<Product>>> partionedEntrySet = partionedMap.entrySet();
		for (Entry<Boolean, List<Product>> entry : partionedEntrySet)
		{
			System.out.println(entry.getKey() +" = "+entry.getValue());
		}
		
	}

}