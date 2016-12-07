public class DisplayNumberThread extends Thread
{

	public static void main(String[] args)
	{
		DisplayNumberThread displayNumberThread1 = new DisplayNumberThread();
		DisplayNumberThread displayNumberThread2 = new DisplayNumberThread();
		displayNumberThread1.run();
		displayNumberThread2.run();

	}

	public void run()
	{
		for (int i = 1; i < 5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
