public class MyRunnable implements Runnable
{

	Thread t;

	public MyRunnable()
	{

		t = new Thread(this);
		System.out.println("Executing " + t.getName());
		// this will call run() fucntion
		t.start();

		/*
		 * Tests whether the current thread has been
		 * interrupted.
		 */
		if (!t.interrupted())
		{
			// Interrupts this thread.
			t.interrupt();
		}
		// block until other threads finish
		try
		{
			t.join();
		}
		catch (InterruptedException e)
		{
		}
	}

	public void run()
	{
		try
		{
			while (true)
			{
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println(t.getName() + " interrupted:");
			System.out.println(e.toString() + "\n");
		}
	}
}
