class DisplayThread extends Thread
{
	public DisplayThread(String threadName)
	{
		super(threadName);
	}

	public static void main(String args[])
	{
		DisplayThread displayThread1 = new DisplayThread("DisplayThread-1");
		DisplayThread displayThread2 = new DisplayThread("DisplayThread-2");

		displayThread1.start();
		displayThread2.start();
	}

	public void run()
	{

		System.out.println("Before sleep of = " + this.getName());
		try
		{
			/*
			 * Causes the currently executing thread to
			 * sleep (temporarily cease execution) for the
			 * specified number of milliseconds, subject to
			 * the precision and accuracy of system timers
			 * and schedulers. The thread does not lose
			 * ownership of any monitors.
			 */
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("After sleep of = " + this.getName());
	}

}