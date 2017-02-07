/*
 * Example of interrupting thread that behaves normally.
 *  
 * If thread is not in sleeping or waiting state,
 * calling the interrupt() method sets the interrupted
 * flag to true that can be used to stop the thread by
 * the java programmer later.
 */
class DisplayThread extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String args[])
	{
		DisplayThread t1 = new DisplayThread();
		t1.start();

		t1.interrupt();
	}
}