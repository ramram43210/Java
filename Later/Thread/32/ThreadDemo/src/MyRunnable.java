
public class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Run by = "+Thread.currentThread().getName());
	}
}
