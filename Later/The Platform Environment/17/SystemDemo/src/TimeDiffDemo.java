public class TimeDiffDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		long startTime = System.currentTimeMillis();

		int i = 1;
		while (i < 1000)
		{
			Thread.sleep(10);
			++i;
		}

		long endTime = System.currentTimeMillis();

		long timeDiff = endTime - startTime;

		System.out.println("timeDiff in ms = " + timeDiff);

	}

}
