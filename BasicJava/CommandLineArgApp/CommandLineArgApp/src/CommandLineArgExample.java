public class CommandLineArgExample
{
	public static void main(String[] args)
	{

		if (args != null && args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
				String commandLineArg = args[i];
				System.out.println("commandLineArg " + i + " : "
						+ commandLineArg);
			}
		}
		else
		{
			System.out.println("No command-line argument has been passed.");
		}

	}
}