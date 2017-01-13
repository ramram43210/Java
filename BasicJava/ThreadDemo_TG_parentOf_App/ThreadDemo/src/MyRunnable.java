public class MyRunnable implements Runnable
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		String threadName = Thread.currentThread().getName();

		System.out.println("Run by = " + threadName );

	}
}
