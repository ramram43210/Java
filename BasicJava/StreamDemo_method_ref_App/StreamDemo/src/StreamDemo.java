import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Method Reference in stream.
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

		List<String> productNameList = productList.stream()
				.filter(p -> p.getPrice() > 20000) // filtering data
				.map(Product::getName) // fetching Name by referring getName method
				.collect(Collectors.toList()); // collecting as list
		
		System.out.println(productNameList);

	}
}