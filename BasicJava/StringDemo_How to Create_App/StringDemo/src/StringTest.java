public class StringTest
{

	public static void main(String[] args)
	{

		String greeting = "Hello world";
		System.out.println("greeting = " + greeting);

		char[] helloArray =
		{ 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println("helloString = " + helloString);

		String welcomeString = new String("Welcome");
		System.out.println("welcomeString = " + welcomeString);

	}

}
