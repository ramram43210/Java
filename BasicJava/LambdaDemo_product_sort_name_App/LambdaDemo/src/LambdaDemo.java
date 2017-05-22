import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java Lambda Expression Example: Comparator
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "Sony LED TV", 65000f));
		list.add(new Product(2, "Radio", 3000f));
		list.add(new Product(3, "Laptop", 150000f));

		System.out.println("Before Sorting .... \n");

		displayProductInfo(list);

		System.out.println("\nAfter Sorting ...\n");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});

		displayProductInfo(list);
	}

	private static void displayProductInfo(List<Product> list)
	{
		for (Product p : list)
		{
			System.out.println(p.getId() + " " + p.getName() + " "
					+ p.getPrice());
		}
	}

}
