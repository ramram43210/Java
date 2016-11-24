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
		HelloRunnable helloRunnable1 = new HelloRunnable();
		Thread thread1 = new Thread(helloRunnable1, "HelloRunnableThread-1");
		thread1.start();		
		
		HelloRunnable helloRunnable2 = new HelloRunnable();
		Thread thread2 = new Thread(helloRunnable2, "HelloRunnableThread-2");
		thread2.start();	
	}

	@Override
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