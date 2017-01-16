public class MyRunnable implements Runnable
{

	public void run()
	{
		Thread t = Thread.currentThread();
		// tests if this thread is alive
		System.out.println(t.getName()+" - isAlive = " + t.isAlive());
	}
}
