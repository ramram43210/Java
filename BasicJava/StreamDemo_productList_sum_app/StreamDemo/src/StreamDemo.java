import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
/**
 * 
 * Sum by using Collectors Methods.
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

		
		/*
		 * Using Collectors's method to sum the prices.  
		 */		
		LongSummaryStatistics longSummaryStatistics = productList.stream() 
				 .collect(Collectors.summarizingLong((product->product.getPrice())));  
	
		System.out.println(longSummaryStatistics);  
		System.out.println("Count = "+longSummaryStatistics.getCount());
		System.out.println("Sum = "+longSummaryStatistics.getSum());  
		System.out.println("Max Price = "+longSummaryStatistics.getMax());  
		System.out.println("Min Price = "+longSummaryStatistics.getMin());
		System.out.println("Average Price = "+longSummaryStatistics.getAverage());	
				
	}
}