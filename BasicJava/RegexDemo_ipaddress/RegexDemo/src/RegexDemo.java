import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to validate IP address with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		List<String> validIPList = Arrays.asList("1.1.1.1", "255.255.255.255",
				"192.168.1.2", "10.10.1.1", "132.253.111.10", "26.10.2.10",
				"127.0.0.1");

		IPAddressValidator ipAddressValidator = new IPAddressValidator();

		
		for (String ipAddress : validIPList)
		{
			System.out.println(ipAddress + " is Valid? = "
					+ ipAddressValidator.validate(ipAddress));
		}

		System.out.println("--------------------------------------");

		List<String> inValidIPList = Arrays.asList("10.10.10", "222.222.2.999",
				"10.0.0.a");
		
		for (String ipAddress : inValidIPList)
		{
			System.out.println(ipAddress + " is Valid? = "
					+ ipAddressValidator.validate(ipAddress));
		}
	}

}