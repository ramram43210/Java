import java.util.Arrays;
import java.util.IntSummaryStatistics;
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
		 * Processing the average value of all numeric elements of the
		 * stream:
		 * 
		 * Methods averagingXX(), summingXX() and summarizingXX() can
		 * work as with primitives (int, long, double) as with their
		 * wrapper classes (Integer, Long, Double). One more powerful
		 * feature of these methods is providing the mapping. So,
		 * developer doesn’t need to use an additional map() operation
		 * before the collect() method.
		 */
		double averagePrice = productList.stream()
				.collect(Collectors.averagingInt(Product::getPrice));

		System.out.println("averagePrice = " + averagePrice);

		/*
		 * Processing the sum of all numeric elements of the stream:
		 */

		int summingPrice = productList.stream()
				.collect(Collectors.summingInt(Product::getPrice));

		System.out.println("summingPrice = " + summingPrice);

		/*
		 * Collecting statistical information about stream’s elements:
		 */
		IntSummaryStatistics statistics = productList.stream()
				.collect(
						Collectors.summarizingInt(Product::getPrice));

		System.out.println("statistics = " + statistics);
		System.out.println("Average = " + statistics.getAverage());
		System.out.println("Count = " + statistics.getCount());
		System.out.println("Max = " + statistics.getMax());
		System.out.println("Min = " + statistics.getMin());
		System.out.println("Sum = " + statistics.getSum());
	}

}