import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorDemo1
{
	public static void main(String[] args)
	{
		List<Customer> customerList = Arrays.asList(
				new Customer("Peter", "John"),
				new Customer("Steve", "Smith"),
				new Customer("Dave", "John"),
				new Customer("Robert", "pattinson"));

		List<Customer> filteredList = customerList.stream()
												  .filter(c -> c.getLastName().startsWith("John"))
											      .collect(Collectors.toList());

		System.out.println(filteredList);

	}
}