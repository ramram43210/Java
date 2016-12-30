import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool
{

	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++)
		{
			Runnable runnableTask = new RunnableTask(" " + i);
			executor.execute(runnableTask);
		}
		executor.shutdown();
		while (!executor.isTerminated())
		{
		}
		System.out.println("Finished all threads");
	}
}