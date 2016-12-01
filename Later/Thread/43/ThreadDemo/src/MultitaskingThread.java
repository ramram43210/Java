/*
 * How to perform multiple tasks by multiple threads
 * (multitasking in multithreading)?
 * 
 * Program of performing two tasks by two threads
 */
public class MultitaskingThread
{

	public static void main(String args[]) throws InterruptedException
	{
		/*
		 * annonymous class that extends Thread class
		 */
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("task 1 run by = "
						+ Thread.currentThread().getName());
			}
		};
		/*
		 * annonymous class that extends Thread class
		 */
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println("task 2 run by = "
						+ Thread.currentThread().getName());
			}
		};

		t1.start();
		t2.start();

	}

}