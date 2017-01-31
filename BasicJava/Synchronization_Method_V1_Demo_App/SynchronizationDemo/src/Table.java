public class Table
{

	/*
	 *  Method is synchronized
	 */
	public synchronized void printTable(int n)
	{
		System.out.println("Thread Name = "
					+ Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(n * i);
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	/*
	 *  Method is not synchronized.
	 */
	/*public void printTable(int n)
	{
		System.out.println("Thread Name = "
				+ Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(n * i);
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}*/
	

	
}
