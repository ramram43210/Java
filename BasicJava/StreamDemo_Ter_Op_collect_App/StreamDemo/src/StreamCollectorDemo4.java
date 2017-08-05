import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorDemo4
{
	public static void main(String[] args)
	{
		List<Customer> customerList = Arrays.asList(
				new Customer("Peter", "John"),
				new Customer("Steve", "Smith"),
				new Customer("Dave", "John"),
				new Customer("Robert", "pattinson"));

		String joining = customerList.stream()
									 .filter(c -> c.getLastName().contains("John"))
									 .map(c -> c.getFirstName())
									 .collect(Collectors.joining(", ",
											"In customerList: [",
											"] have the same lastName John."));

		System.out.println(joining);

	}
}