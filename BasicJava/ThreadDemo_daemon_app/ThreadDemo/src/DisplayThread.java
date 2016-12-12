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

		/*
		 * Marks this thread as either a daemon thread or a
		 * user thread. The Java Virtual Machine exits when
		 * the only threads running are all daemon threads.
		 * This method must be invoked before the thread is
		 * started.
		 * 
		 * Now t1 is daemon thread
		 */
		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
	}
}