public class MyRunnable implements Runnable
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		String threadName = Thread.currentThread().getName();
		/*
		 * Returns the name of this thread group.
		 */
		String threadGroupName = Thread.currentThread().getThreadGroup()
				.getName();

		String parentThreadGroupName = Thread.currentThread().getThreadGroup()
				.getParent().getName();

		System.out.println("Run by = " + threadName + " , Thread GroupName = "
				+ threadGroupName + "\n , Parent Thread GroupName = "
				+ parentThreadGroupName+"\n");
		
	}
}
