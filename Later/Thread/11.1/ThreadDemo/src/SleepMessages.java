public class SleepMessages
{
	public static void main(String args[]) throws InterruptedException
	{
		String messages[] =
		{ "Hello good morning", "Did you eat", "I am going to walk",
				"Good night" };

		for (String message : messages)
		{
			// Pause for 5 seconds
			Thread.sleep(5000);
			// Print a message
			System.out.println(message);
		}

	}
}