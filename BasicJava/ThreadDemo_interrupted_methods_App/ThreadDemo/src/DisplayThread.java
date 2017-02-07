class DisplayThread extends Thread
{
	public void run()
	{

		/*
		 * Tests whether this thread has been interrupted.
		 * The interrupted status of the thread is
		 * unaffected by this method.
		 */
		System.out.println("Before Thread.interrupted() is called = "
				+ Thread.currentThread().isInterrupted());

		/*
		 * Tests whether the current thread has been
		 * interrupted. The interrupted status of the thread
		 * is cleared by this method.
		 */
		if (Thread.interrupted())
		{

			System.out.println("After Thread.interrupted() is called = "
					+ Thread.currentThread().isInterrupted());
			System.out.println("code for interrupted thread");
		}
		else
		{
			System.out.println("code for normal thread");
		}
	}

	public static void main(String args[])
	{
		DisplayThread t1 = new DisplayThread();
		t1.start();
		t1.interrupt();
	}
}