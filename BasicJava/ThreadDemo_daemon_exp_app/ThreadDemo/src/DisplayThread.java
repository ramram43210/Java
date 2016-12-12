/*
 * public final void setDaemon(boolean on)
 * 
 * Parameters:
 * ----------- 
 * 
 * on - if true, marks this thread as a
 * daemon thread
 */

public class DisplayThread extends Thread
{

	public void run()
	{
		/*
		 * Tests if this thread is a daemon thread.
		 */
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread = "
					+ Thread.currentThread().getName());
		}
		else
		{
			System.out.println("user thread = "
					+ Thread.currentThread().getName());
		}
	}

	public static void main(String[] args)
	{
		DisplayThread t1 = new DisplayThread();
		t1.setName("Thread 1");
		DisplayThread t2 = new DisplayThread();
		t2.setName("Thread 2");
		DisplayThread t3 = new DisplayThread();
		t3.setName("Thread 3");

		t1.start();

		/*
		 * If you want to make a user thread as Daemon, it
		 * must not be started otherwise it will throw
		 * IllegalThreadStateException.
		 * 
		 * below line will throw
		 * IllegalThreadStateException, because t1 thread is
		 * started already.
		 */
		t1.setDaemon(true);
		t2.start();
		t3.start();
	}
}