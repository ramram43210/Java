public class Table
{
	public void printTable(int n)
	{

		/*
		 * Synchronized block
		 */
		synchronized (this)
		{
			System.out.println("Thread Name = "
					+ Thread.currentThread().getName());
			for (int i = 1; i <= 5; i++)
			{
				System.out.println(n * i);
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
