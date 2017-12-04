import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexPredicateDemo
{

	public static void main(String[] args)
	{
		String regex = "^(.+)@gmail.com$";
		Pattern pattern = Pattern.compile(regex);

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
		List<String> desiredEmailList = emailList.stream()
										   .filter(emailFilterPredicate)
										   .collect(Collectors.<String>toList());

		desiredEmailList.forEach(System.out::println);
	}

}
