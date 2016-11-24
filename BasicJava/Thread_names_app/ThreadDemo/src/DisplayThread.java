public class DisplayThread extends Thread
{

	public DisplayThread(String threadName)
	{
		super(threadName);
	}

	public static void main(String[] args)
	{
		DisplayThread displayThread1 = new DisplayThread("DisplayThread_100");
		displayThread1.start();
		
		DisplayThread displayThread2 = new DisplayThread("DisplayThread_200");
		displayThread2.start();

	}

	public void run()
	{
		/*
		 * Returns this thread's name.
		 */
		System.out.println("Run by = " + this.getName());
	}
}
