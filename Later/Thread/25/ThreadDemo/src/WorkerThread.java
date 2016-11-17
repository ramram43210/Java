/*
 * Here is a runnable task, called WorkerThread. This
 * task performs some work and then periodically reports
 * what percent of the work it has completed:
 */
public class WorkerThread implements Runnable
{
	private int workerNumber;

	WorkerThread(int number)
	{
		workerNumber = number;
	}

	public void run()
	{
		for (int i = 0; i <= 100; i += 20)
		{
			// Perform some work ...
			System.out.println("Worker number: " + workerNumber
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