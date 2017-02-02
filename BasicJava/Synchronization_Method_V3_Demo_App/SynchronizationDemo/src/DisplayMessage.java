public class DisplayMessage
{

	/*
	 *  Method is synchronized
	 */
	public synchronized void showMessage(String msg)
	{
		System.out.println("Thread Name = "
					+ Thread.currentThread().getName());
		System.out.print("[" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
