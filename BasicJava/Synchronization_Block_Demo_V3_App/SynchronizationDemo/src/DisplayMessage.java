public class DisplayMessage
{

	public void showMessage(String msg)
	{

		/*
		 * synchronized block.
		 */
		synchronized (this)
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

}
