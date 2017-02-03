public class DisplayCounter
{

	public void printCount()
	{
		/*
		 * synchronized block.
		 */
		//synchronized (this)
		//{
			try
			{
				System.out.println("Thread Name = " + Thread.currentThread().getName());
				for (int i = 5; i > 0; i--)
				{
					System.out.println("Counter   ---   " + i);
					Thread.sleep(200);
				}
				System.out.println();				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		//}

	}
}
