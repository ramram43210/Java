@FunctionalInterface
interface Message
{
	String displayMessage(char[] chArray);
}

public class LambdaDemo
{
	public static void main(String[] args)
	{

		/*
		 * Note that, in this program strFunc() of FunctionalInterface
		 * returns a reference of type String. In this program, the
		 * expression "String::new" creates a constructor reference to
		 * the String's constructor.
		 */
		Message message = String::new;

		char[] charArray =	{ 'P', 'e', 't', 'e', 'r' };

		/*
		 * Here the method StrFunc() takes a Character array as an
		 * argument, so the parameterized constructor 
		 * String(char[] charArray) is referred here.
		 * 
		 * So finally, when ever you call the method strFunc() on
		 * FunctionalInterface reference, a String object is
		 * constructed and returned.
		 */
		System.out.println(message.displayMessage(charArray));
	}

}
