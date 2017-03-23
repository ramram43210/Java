import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filtering and Iterating Collection:
 *
 * Here, we are filtering data by using stream. You can see that code
 * is optimized and maintained. Stream provides fast execution.
 *
 */

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Product> productList = new ArrayList<Product>();

		// Adding Products
		productList.add(new Product(1, "Sony mobile", 25000));
		productList.add(new Product(2, "Lenovo mobile", 15000));
		productList.add(new Product(3, "Nokia mobile", 10000));
		productList.add(new Product(4, "Samsung mobile", 40000));

		List<Product> filteredProductPriceList = productList.stream()
				.filter(p -> p.getPrice() < 30000)// filtering data
				.collect(Collectors.toList()); // collecting as list

		filteredProductPriceList
				.forEach(product -> System.out.println(product));
	}

}