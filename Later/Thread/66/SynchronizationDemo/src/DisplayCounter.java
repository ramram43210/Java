public class DisplayCounter
{

	/*public void printCount()
	{
		try
		{
			System.out.println("Thread Name = " + Thread.currentThread().getName());
			System.out.println();
			for (int i = 5; i > 0; i--)
			{
				System.out.println("Counter   ---   " + i);
			}
			System.out.println();
		}
		catch (Exception e)
		{
			System.out.println("Thread  interrupted.");
		}

	}*/

	public void printCount()
	{
		/*
		 * synchronized block.
		 */
		synchronized (this)
		{
			try
			{
				System.out.println("Thread Name = " + Thread.currentThread().getName());
				for (int i = 5; i > 0; i--)
				{
					System.out.println("Counter   ---   " + i);
				}
				System.out.println();
			}
			catch (Exception e)
			{
				System.out.println("Thread  interrupted.");
			}
		}

	}
}
