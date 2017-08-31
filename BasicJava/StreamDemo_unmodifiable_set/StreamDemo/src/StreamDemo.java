import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
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
		 * Pushing the collector to perform additional transformation:
		 * 
		 * The collector has converted a stream to a Set and then
		 * created the unmodifiable Set out of it.
		 */
		Set<Product> unmodifiableSet = productList.stream()
				.collect(Collectors.collectingAndThen(
						Collectors.toSet(),
						Collections::unmodifiableSet));

		System.out.println("unmodifiableSet = " + unmodifiableSet);
		
	}

}