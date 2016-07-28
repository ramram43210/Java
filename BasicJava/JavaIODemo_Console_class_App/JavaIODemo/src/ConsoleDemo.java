import java.io.Console;
import java.io.IOException;

public class ConsoleDemo
{

	public static void main(String[] args) throws IOException
	{
		ConsoleDemo consoleDemo = new ConsoleDemo();
		consoleDemo.readFromConsole();
	}

	private void readFromConsole() throws IOException
	{
		/*
		 * System class provides a static method console()
		 * that returns the unique instance of Console
		 * class.
		 */
		Console console = System.console();
		System.out.print("Enter the username : ");
		String name = console.readLine();
		System.out.println("UserName = " + name);
		
		System.out.print("Enter the password : ");
		char[] passWordArray = console.readPassword();
		String passWord = new String(passWordArray);
		System.out.println("PassWord = " + passWord);
	}

}
