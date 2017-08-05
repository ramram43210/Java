import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorDemo2
{
	public static void main(String[] args)
	{
		List<Customer> customerList = Arrays.asList(
				new Customer("Peter", "John"),
				new Customer("Steve", "Smith"),
				new Customer("Dave", "John"),
				new Customer("Robert", "pattinson"));

		Map<String, List<Customer>> groupMap = customerList.stream()
		        							  .collect(Collectors.groupingBy(c -> c.getLastName()));
		 
		groupMap.forEach(
		        (lastName, customer) -> System.out.println(lastName + ": " + customer));

	}
}