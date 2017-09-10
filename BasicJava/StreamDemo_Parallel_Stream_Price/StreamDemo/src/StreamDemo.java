import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Product> productList = Arrays.asList(
				new Product("potatoes", 15),
				new Product("orange", 15), new Product("lemon", 20),
				new Product("bread", 20), new Product("sugar", 30));

		/*
		 * Before Java 8, parallelization was complex. Emerging of the
		 * ExecutorService and the ForkJoin simplified developer’s
		 * life a little bit, but they still should keep in mind how
		 * to create a specific executor, how to run it and so on.
		 * Java 8 introduced a way of accomplishing parallelism in a
		 * functional style.
		 * 
		 * The API allows creating parallel streams, which perform
		 * operations in a parallel mode. When the source of a stream
		 * is a Collection or an array it can be achieved with the
		 * help of the parallelStream() method:
		 * 
		 * Under the hood, Stream API automatically uses the ForkJoin
		 * framework to execute operations in parallel. By default,
		 * the common thread pool will be used and there is no way (at
		 * least for now) to assign some custom thread pool to it.
		 */

		Stream<Product> stream = productList.parallelStream();
		boolean isParallel = stream.isParallel();

		System.out.println("isParallel = " + isParallel);

		boolean bigPrice = stream
				.map(product -> product.getPrice())
				.anyMatch(price -> price > 25);

		System.out.println("bigPrice = " + bigPrice);

	}

}