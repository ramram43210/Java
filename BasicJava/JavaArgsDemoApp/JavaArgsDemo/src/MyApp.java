/**
 * This program prints arguments passed in the output screen.
 */
public class MyApp
{

	public static void main(String[] args)
	{

		System.out.println("Argument Length : "+args.length);
		
		if (args.length == 0)
		{
			System.out.println("No arguments passed");	
		}
		else
		{
			for (String arg : args)
			{
				System.out.println(arg);
			}
		}

	}
}
