public class RunnableTask implements Runnable
{

	private String taskNumber;

	public RunnableTask(String taskNumber)
	{
		this.taskNumber = taskNumber;
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()
				+ " Start. taskNumber = " + taskNumber);
		processCommand();
		System.out.println(Thread.currentThread().getName()
				+ " End of taskNumber =" + taskNumber);
	}

	private void processCommand()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String toString()
	{
		return this.taskNumber;
	}
}