/*
 * Example of interrupting a thread that doesn't stop
 * working
 * 
 * In this example, after interrupting the thread, we
 * handle the exception, so it will break out the
 * sleeping but will not stop working.
 */

class DisplayThread extends Thread
{

	public void run()
	{
		try
		{
			System.out.println("Going to sleep...");
			Thread.sleep(1000);
			System.out.println("Welcome to India...");
		}
		catch (InterruptedException e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("Thread is running...");
	}

	public static void main(String args[])
	{
		DisplayThread t1 = new DisplayThread();
		t1.start();
		try
		{
			t1.interrupt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}