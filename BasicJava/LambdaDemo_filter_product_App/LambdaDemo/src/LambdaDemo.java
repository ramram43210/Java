import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Java Lambda Expression Example: Filter Collection Data
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "Sony LED TV", 60000f));
		list.add(new Product(2, "Radio", 3000f));
		list.add(new Product(3, "Laptop", 80000f));
		list.add(new Product(4, "Smart phone", 70000f));
		list.add(new Product(5, "Mouse", 1500f));

		/*
		 * Using lambda to filter data
		 */
		Stream<Product> filteredStream = list.stream()
				                       .filter(p -> p.getPrice() > 50000);

		/*
		 * Using lambda to iterate through collection
		 */
		filteredStream.forEach(product -> System.out.println(
				product.getName() + ": " + product.getPrice()));
	}

}
