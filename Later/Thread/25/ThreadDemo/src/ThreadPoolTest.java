import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * In ThreadPoolTest, we can specify the number of
 * worker threads to create and the size of the thread
 * pool that will be used to run the threads. This
 * example uses a fixed thread pool so that you can
 * observe the effect of running the program with fewer
 * threads than tasks:
 */
public class ThreadPoolTest
{

	public static void main(String[] args)
	{
		int numWorkers = 4;
		int threadPoolSize = 2;

		ExecutorService tpes = Executors.newFixedThreadPool(threadPoolSize);

		WorkerThread[] workers = new WorkerThread[numWorkers];
		for (int i = 0; i < numWorkers; i++)
		{
			workers[i] = new WorkerThread(i);
			tpes.execute(workers[i]);
		}
		tpes.shutdown();
	}
}