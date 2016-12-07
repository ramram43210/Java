class DisplayNumberThread extends Thread
{
	public static void main(String args[])
	{
		DisplayNumberThread dnt1 = new DisplayNumberThread();
		DisplayNumberThread dnt2 = new DisplayNumberThread();
		DisplayNumberThread dnt3 = new DisplayNumberThread();
		dnt1.start();
		try
		{
			/*
			 * Waits at most millis milliseconds for this
			 * thread to die.
			 */
			dnt1.join(2500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		dnt2.start();
		dnt3.start();
	}

	public void run()
	{
		for (int i = 1; i <= 5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(this.getName() + " = " + i);
		}
	}
}