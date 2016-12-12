class DisplayThread extends Thread
{

	public static void main(String args[])
	{
		DisplayThread displayThread1 = new DisplayThread();
		DisplayThread displayThread2 = new DisplayThread();

		displayThread1.start();
		displayThread2.start();
	}

	public void run()
	{
		System.out.println("Thread name =" + Thread.currentThread().getName()
				+ ", Thread Priority = " + Thread.currentThread().getPriority()
				+ "\n");

	}
}