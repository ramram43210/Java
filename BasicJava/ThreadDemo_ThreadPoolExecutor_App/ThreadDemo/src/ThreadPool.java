import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool
{

	public static void main(String[] args) throws InterruptedException
	{
		// RejectedExecutionHandler implementation
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
		// Get the ThreadFactory implementation to use
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		// creating the ThreadPoolExecutor
		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10,
				TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2),
				threadFactory, rejectionHandler);
		// start the monitoring thread
		MonitorThread monitor = new MonitorThread(executorPool, 3);
		Thread monitorThread = new Thread(monitor);
		monitorThread.start();
		// submit work to the thread pool
		for (int i = 1; i <= 10; i++)
		{
			executorPool.execute(new RunnableTask("task" + i));
		}

		Thread.sleep(30000);
		// shut down the pool
		executorPool.shutdown();
		// shut down the monitor thread
		Thread.sleep(5000);
		monitor.shutdown();
	}
}