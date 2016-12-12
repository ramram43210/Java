class DisplayThread extends Thread
{
	public static void main(String args[])
	{
		DisplayThread displayThread1 = new DisplayThread();
		DisplayThread displayThread2 = new DisplayThread();
		DisplayThread displayThread3 = new DisplayThread();

		displayThread1.setPriority(Thread.MIN_PRIORITY);
		displayThread2.setPriority(Thread.NORM_PRIORITY);
		displayThread3.setPriority(Thread.MAX_PRIORITY);

		displayThread1.start();
		displayThread2.start();
		displayThread3.start();

	}

	public void run()
	{
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ ", Thread Priority = " + Thread.currentThread().getPriority()
				+ "\n");

	}
}