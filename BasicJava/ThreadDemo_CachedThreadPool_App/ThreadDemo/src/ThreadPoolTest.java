import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest
{
	public static void main(String[] args)
	{
		int numOfCallableTasks = 4;

		ExecutorService executorService = Executors.newCachedThreadPool();
		CallableTask callableTasks[] = new CallableTask[numOfCallableTasks];
		Future<?> futures[] = new Future[numOfCallableTasks];

		for (int i = 0; i < numOfCallableTasks; i++)
		{
			callableTasks[i] = new CallableTask(i);
			futures[i] = executorService.submit(callableTasks[i]);
		}
		for (int i = 0; i < numOfCallableTasks; i++)
		{
			try
			{
				System.out.println("Ending task : " + futures[i].get());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}