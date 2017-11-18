/**
 * 
 * How to validate password with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		PasswordValidator passwordValidator = new PasswordValidator();
		
		System.out.println("'peter1AB@' is valid? = "+passwordValidator.validate("peter1AB@"));
		System.out.println("'peter4COW$' is valid?  = "+passwordValidator.validate("peter4COW$"));
		System.out.println("'peter78Dog%#' is valid?  = "+passwordValidator.validate("peter78Dog%#"));
		
		System.out.println("--------------------------------------------------");
		
		/*
		 *  too short, minimum 6 characters
		 */
		System.out.println("'p1AB@' is valid? = "+passwordValidator.validate("p1AB@"));
		
		/*
		 *  uppercase characters is required
		 */
		System.out.println("'peter1@' is valid? = "+passwordValidator.validate("peter1@"));
		
		
		/*
		 *  special symbol “*” is not allow here
		 */
		System.out.println("'peterAB2*' is valid? = "+passwordValidator.validate("peterAB2*"));
		
		/*
		 *  digit is required
		 */
		System.out.println("'peterAB$' is valid? = "+passwordValidator.validate("peterAB$"));
		
		
		/*
		 *  lower case character is required
		 */
		System.out.println("'PETER2$' is valid? = "+passwordValidator.validate("PETER2$"));
		
		
	}

}