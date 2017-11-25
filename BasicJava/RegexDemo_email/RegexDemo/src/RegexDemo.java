import java.util.ArrayList;

/**
 * 
 * How to validate email address with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		ArrayList<String> validEmailList = new ArrayList<>();
		validEmailList.add("peter@yahoo.com");
		validEmailList.add("peter@yahoo.net");
		validEmailList.add("peter.50@yahoo.com");
		validEmailList.add("peter-100@yahoo.com");
		validEmailList.add("peter@gmail.com");
		validEmailList.add("peter+900@oracle.com");

		EmailValidator emailValidator = new EmailValidator();
		
		for (String email : validEmailList)
		{
			System.out.println(email + " is Valid = " + emailValidator.validate(email));
		}

			
		System.out.println("--------------------------------------");
		
		ArrayList<String> inValidEmailList = new ArrayList<>();
		inValidEmailList.add("peteryahoo.com"); // @ Symbol missing
		inValidEmailList.add("peter.50@.yahoo.com"); //. after @ symbol is not allowed
		inValidEmailList.add("peter.@yahoo.com");//. before @ symbol is not allowed
		inValidEmailList.add("peter@gmail@com");// two @ symbols are not allowed
		inValidEmailList.add("peter..900@oracle.com");// two dots are not allowed
		
		for (String email : inValidEmailList)
		{
			System.out.println(email + " is Valid = " + emailValidator.validate(email));
		}	

	}

}