/*
 * Program of performing single task by multiple threads
 */
public class MultitaskingThread extends Thread
{

	public static void main(String args[]) throws InterruptedException
	{
		MultitaskingThread t1 = new MultitaskingThread();
		MultitaskingThread t2 = new MultitaskingThread();
		MultitaskingThread t3 = new MultitaskingThread();

		t1.start();
		t2.start();
		t3.start();
	}

	/*
	 * If you have to perform single task by many threads, have only
	 * one run() method.
	 */
	public void run()
	{
		System.out.println("task 1" + " Run by = "
				+ Thread.currentThread().getName());
	}
}