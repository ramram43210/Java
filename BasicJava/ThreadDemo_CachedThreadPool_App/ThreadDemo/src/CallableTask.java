import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer>
{
	private int taskNumber;

	CallableTask(int taskNumber)
	{
		this.taskNumber = taskNumber;
	}

	public Integer call()
	{
		for (int i = 0; i <= 100; i += 20)
		{
			// Perform some work ...
			System.out.println(Thread.currentThread().getName()
					+ " taskNumber : " + taskNumber + ", percent complete: "
					+ i);
			try
			{
				Thread.sleep((int) (Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
			}
		}
		return (taskNumber);
	}
}