@FunctionalInterface
interface Message
{
	String displayMessage(String strValue);
}

/**
 * Java Lambda Expression Example: Multiple Statements
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		/*
		 * We can pass multiple statements in lambda expression.
		 */
		Message msg = (strValue) -> {
			String str1 = "Welcome to ";
			String str2 = str1 + strValue;
			return str2;
		};
		System.out.println(msg.displayMessage("India."));
	}

}
