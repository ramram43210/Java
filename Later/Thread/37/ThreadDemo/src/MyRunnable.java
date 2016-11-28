public class MyRunnable implements Runnable
{
	public void run()
	{
		/*
		 * Returns the state of this thread.
		 */
		Thread.State state = Thread.currentThread().getState();
		System.out.print("Thread Name = " + Thread.currentThread().getName());
		System.out.println(" , state = " + state);
	}
}
