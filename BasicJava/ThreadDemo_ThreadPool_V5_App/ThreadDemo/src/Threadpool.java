import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Threadpool
{
	public static void main(String[] args)
	{
		System.out.println("Main Thread starts");
		ExecutorService threadExecutor = Executors.newFixedThreadPool(2);
		
		PrintCharTask taskl = new PrintCharTask('*', 5);
		PrintCharTask task2 = new PrintCharTask('S', 5);
		PrintCharTask task3 = new PrintCharTask('M', 5);
		PrintCharTask task4 = new PrintCharTask('N', 5);
		
		threadExecutor.execute(taskl);
		threadExecutor.execute(task2);
		threadExecutor.execute(task3);
		threadExecutor.execute(task4);
		/*
		 * Tells the threadExecutor to shutdown. No new task
		 * can be accepted but the existing task will
		 * continue to finish.
		 */
		threadExecutor.shutdown();
		/*
		 * In order to ensure that the main thread finishes
		 * last i.e. all tasks are finished before the main
		 * thread terminates, we put the below while
		 * statement.
		 */
		while (!threadExecutor.isTerminated())
		{
		}
		System.out.println("\nMain Thread Ends");
	}
}