public class MyRunnable implements Runnable
{

	Thread t;

	public MyRunnable(String str)
	{

		t = new Thread(this, str);
		// this will call run() function
		t.start();
	}

	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			/*
			 * Yields control to another thread every 5
			 * iterations
			 */
			if ((i % 5) == 0)
			{
				System.out.println(Thread.currentThread().getName()
						+ " yielding control...");

				/*
				 * Causes the currently executing thread
				 * object to temporarily pause and allow
				 * other threads to execute.
				 * 
				 * A hint to the scheduler that the current
				 * thread is willing to yield its current
				 * use of a processor. The scheduler is free
				 * to ignore this hint.
				 */
				Thread.yield();
			}

		}
		System.out.println(Thread.currentThread().getName()
				+ " has finished executing.");
	}
}
