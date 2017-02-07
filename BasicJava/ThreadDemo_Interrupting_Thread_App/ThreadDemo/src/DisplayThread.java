/*
 * Example of interrupting a thread that stops
 * working.
 * 
 * In this example, after interrupting the thread, we
 * are propagating it, so it will stop working. If we
 * don't want to stop the thread, we can handle it where
 * sleep() or wait() method is invoked.
 */
class DisplayThread extends Thread
{

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
			throw new RuntimeException("Thread interrupted... " + e);
		}

	}

}