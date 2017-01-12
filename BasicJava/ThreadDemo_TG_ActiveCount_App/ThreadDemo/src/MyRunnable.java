
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
		System.out.println("Run by = "+Thread.currentThread().getName());
	}
}
