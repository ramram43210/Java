import java.util.regex.Pattern;
/**
 * Generate Stream from APIs like Regex.
 */
public class StreamDemo3
{
	public static void main(String[] args)
	{
		String str = "Welcome,to,India";
		Pattern.compile(",").splitAsStream(str).forEach(System.out::println);
	}

}