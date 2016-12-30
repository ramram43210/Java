class PrintCharTask implements Runnable
{
	private char character;
	private int noOfTimes;

	PrintCharTask(char ch, int n)
	{
		character = ch;
		noOfTimes = n;
	}

	public void run()
	{
		for (int i = 0; i < noOfTimes; i++)
		{
			System.out.println(character + " ");
		}
	}
}