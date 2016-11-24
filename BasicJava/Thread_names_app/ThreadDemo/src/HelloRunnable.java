/*
 * public Thread(Runnable target, String name)
 * 
 * Parameters:
 * -----------
 * 
 * target - the object whose run method is invoked when
 * this thread is started. If null, this thread's run
 * method is invoked.
 * 
 * name - the name of the new thread
 */

public class HelloRunnable implements Runnable
{

	public static void main(String args[])
	{
		HelloRunnable helloRunnable = new HelloRunnable();
		Thread thread = new Thread(helloRunnable, "HelloRunnableThread");
		thread.start();
		/*
		 * Returns this thread's name.
		 */
		System.out.println("Thread Name = " + thread.getName());
	}

	@Override
	public void run()
	{
		System.out.println("Hello from a thread!");
	}
}