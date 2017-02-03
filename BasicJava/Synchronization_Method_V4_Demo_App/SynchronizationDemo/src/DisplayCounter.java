public class DisplayCounter
{

	public synchronized void printCount()
	{

		try
		{
			System.out.println("Thread Name = "
					+ Thread.currentThread().getName());
			for (int i = 5; i > 0; i--)
			{
				System.out.println("Counter   ---   " + i);
				Thread.sleep(500);
			}
			System.out.println();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
