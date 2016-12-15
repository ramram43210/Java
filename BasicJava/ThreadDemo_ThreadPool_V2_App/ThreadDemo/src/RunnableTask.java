/*
 * Here is a runnable task. This task performs some work and
 * then periodically reports what percent of the work it has
 * completed:
 */

public class RunnableTask implements Runnable
{
	private int taskNumber;

	public RunnableTask(int taskNumber)
	{
		this.taskNumber = taskNumber;
	}

	public void run()
	{
		for (int i = 0; i <= 100; i += 20)
		{
			// Perform some work ...
			System.out.println(Thread.currentThread().getName()
					+ " = RunnableTask number: " + taskNumber
					+ ", percent complete: " + i);
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}