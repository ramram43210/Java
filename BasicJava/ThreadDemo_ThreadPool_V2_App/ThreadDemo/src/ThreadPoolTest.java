import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest
{

	public static void main(String[] args)
	{
		int numRunnableTask = 4;
		int threadPoolSize = 2;

		ExecutorService tpes = Executors.newFixedThreadPool(threadPoolSize);

		RunnableTask[] runnableTasks = new RunnableTask[numRunnableTask];
		for (int i = 0; i < numRunnableTask; i++)
		{
			runnableTasks[i] = new RunnableTask(i);
			tpes.execute(runnableTasks[i]);
		}
		tpes.shutdown();
	}
}