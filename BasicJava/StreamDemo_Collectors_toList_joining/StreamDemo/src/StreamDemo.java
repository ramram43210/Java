import java.util.Arrays;
import java.util.List;
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
		 * Converting a stream to the Collection (Collection, List or
		 * Set):
		 */
		List<String> productNameList = productList.stream()
				.map(Product::getName).collect(Collectors.toList());

		System.out.println("productNameList = " + productNameList);

		/*
		 * Reducing to String:
		 * 
		 * The joiner() method can have from one to three parameters
		 * (delimiter, prefix, suffix). The handiest thing about using
		 * joiner() – developer doesn’t need to check if the stream
		 * reaches its end to apply the suffix and not to apply a
		 * delimiter. Collector will take care of that.
		 */

		String listToString = productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining(", ", "[", "]"));

		System.out.println("listToString = " + listToString);

	}

}