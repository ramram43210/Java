/*
 * How to perform multiple tasks by multiple threads
 * (multitasking in multithreading)?
 * 
 * Program of performing two tasks by two threads
 */
public class MultitaskingRunnable
{

	public static void main(String[] args)
	{
		/*
		 * annonymous class that implements Runnable
		 * interface
		 */
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("task 1 run by = "
						+ Thread.currentThread().getName());
			}
		};
		/*
		 * annonymous class that implements Runnable
		 * interface
		 */
		Runnable r2 = new Runnable()
		{
			public void run()
			{
				System.out.println("task 2 run by = "
						+ Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

	}

}
