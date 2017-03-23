import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * Convert List into Map.
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
		productList.add(new Product(5, "Micromax mobile", 10000));

		// Converting Product List into a Map
		Map<String, Integer> productPriceMap = productList.stream()
				.collect(Collectors.toMap(p -> p.getName(),	p -> p.getPrice()));

		System.out.println(productPriceMap);

	}
}