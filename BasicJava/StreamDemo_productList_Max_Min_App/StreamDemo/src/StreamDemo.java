import java.util.ArrayList;
import java.util.List;

/**
 *
 * Find Max and Min Product Price.
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


		 // max() method to get max Product price
        Product maxPriceProduct = productList.stream()
                        .max((product1, product2)->
                        product1.getPrice() > product2.getPrice() ? 1: -1).get();

        System.out.println("Max price product = "+maxPriceProduct);

        // min() method to get min Product price
        Product minPriceProduct = productList.stream()
                .min((product1, product2)->
                product1.getPrice() > product2.getPrice() ? 1: -1).get();

        System.out.println("Min price product = "+minPriceProduct);

	}
}