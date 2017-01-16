/*
 * Program of performing single task by multiple threads
 */
public class MultitaskingRunnable implements Runnable
{

	public static void main(String[] args)
	{
		MultitaskingRunnable multitaskingRunnable = new MultitaskingRunnable();
		Thread t1 = new Thread(multitaskingRunnable);
		Thread t2 = new Thread(multitaskingRunnable);

		t1.start();
		t2.start();

	}

	public void run()
	{
		System.out.println("task 1" + " Run by = "
				+ Thread.currentThread().getName());
	}

}
