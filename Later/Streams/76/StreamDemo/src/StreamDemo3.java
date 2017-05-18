import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3
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
		Map<Integer, List<Product>> mapOfList = productList.stream()
				.collect(Collectors.groupingBy(Product::getPrice));

		System.out.println("mapOfList = " + mapOfList);

		/*
		 * Dividing stream’s elements into groups according to some
		 * predicate:
		 */
		Map<Boolean, List<Product>> mapPartioned = productList
				.stream().collect(Collectors.partitioningBy(
						element -> element.getPrice() > 20));
		
		System.out.println("\nmapPartioned = " + mapPartioned);

	}

}