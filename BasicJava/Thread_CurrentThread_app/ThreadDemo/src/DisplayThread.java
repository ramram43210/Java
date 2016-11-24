public class DisplayThread extends Thread
{

	public DisplayThread(String threadName)
	{
		super(threadName);
	}

	public static void main(String[] args)
	{
		DisplayThread displayThread1 = new DisplayThread("DisplayThread-1");
		displayThread1.start();

		DisplayThread displayThread2 = new DisplayThread("DisplayThread-2");
		displayThread2.start();

	}

	public void run()
	{
		/*
		 * Returns a reference to the currently executing
		 * thread object.
		 */
		Thread thread = Thread.currentThread();
		String threadName = thread.getName();
		System.out.println("Run by = " + threadName);
	}
}
