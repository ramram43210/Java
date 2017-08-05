import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorDemo3
{
	public static void main(String[] args)
	{
		List<Customer> customerList = Arrays.asList(
				new Customer("Peter", "John"),
				new Customer("Steve", "Smith"),
				new Customer("Dave", "John"),
				new Customer("Robert", "pattinson"));

		Map<String, String> lastNameMap = customerList.stream()
				.collect(Collectors.toMap(
						c -> c.getLastName(), c -> c
								.getFirstName(),
						(firstName1, firstName2) -> firstName1 + ","
								+ firstName2));

		System.out.println(lastNameMap);

	}
}