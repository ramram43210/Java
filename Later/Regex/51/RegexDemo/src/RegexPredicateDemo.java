import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexPredicateDemo
{

	public static void main(String[] args)
	{

		Pattern pattern = Pattern.compile("^(.+)@gmail.com$");

		/*
		 * Returns:The predicate which can be used for matching on a
		 * string
		 */
		Predicate<String> emailFilterPredicate = pattern.asPredicate();

		List<String> emailList = Arrays.asList("peter@yahoo.com",
				"bob@gmail.com", "juli@gmail.com",
				"david@rediff.com");

		/*
		 *  Apply predicate filter
		 */
		List<String> desiredEmails = emailList.stream()
										   .filter(emailFilterPredicate)
										   .collect(Collectors.<String>toList());

		desiredEmails.forEach(System.out::println);
	}

}
