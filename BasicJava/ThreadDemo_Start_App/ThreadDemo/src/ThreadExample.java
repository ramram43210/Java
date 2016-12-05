public class ThreadExample
{
	public static void main(String[] args)
	{
		/*
		 * It prints out the name of the thread executing
		 * the main() method. This thread is assigned by the
		 * JVM.
		 */
		System.out.println(Thread.currentThread().getName());

		/*
		 * It starts up 10 threads and give them all a
		 * number as name ("" + i). Each thread then prints
		 * its name out, and then stops executing.
		 */
		for (int i = 0; i < 10; i++)
		{
			new Thread("" + i)
			{
				public void run()
				{
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
		}
	}
}