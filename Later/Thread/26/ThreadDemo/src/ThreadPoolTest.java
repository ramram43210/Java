import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest
{
	public static void main(String[] args)
	{
		int numWorkers = 4;

		ExecutorService tpes = Executors.newCachedThreadPool();
		CallableWorkerThread workers[] = new CallableWorkerThread[numWorkers];
		Future<?> futures[] = new Future[numWorkers];

		for (int i = 0; i < numWorkers; i++)
		{
			workers[i] = new CallableWorkerThread(i);
			futures[i] = tpes.submit(workers[i]);
		}
		for (int i = 0; i < numWorkers; i++)
		{
			try
			{
				System.out.println("Ending worker: " + futures[i].get());
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}