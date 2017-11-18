/**
 *
 * How to validate username with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		UserNameValidator unValidator = new UserNameValidator();
		
		System.out.println("'peter34' is valid userName? = "+unValidator.validate("peter34"));
		System.out.println("'peter_34' is valid userName? = "+unValidator.validate("peter_34"));
		System.out.println("'peter-34' is valid userName? = "+unValidator.validate("peter-34"));

		System.out.println();

		/*
		 * too short, min 3 characters
		 */
		System.out.println("'pk' is valid userName? = "+unValidator.validate("pk"));
		/*
		 * “@” character is not allow
		 */
		System.out.println("'peter@89' is valid userName? = "+unValidator.validate("peter@89"));

		/*
		 * too long, max characters of 15
		 */
		System.out.println("'peter11111323445' is valid userName? = "+unValidator.validate("peter11111323445"));
	}

}