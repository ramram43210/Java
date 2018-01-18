import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		TimerTask cleanUpTimerTask = new CleanUpTimerTask();
		Timer timer = new Timer();

		Date firstTime = new Date(System.currentTimeMillis());
		System.out.println("firstTime = " + firstTime);

		/*
		 * Schedules the specified task for execution after the
		 * specified delay.
		 *
		 * Parameters:
		 *
		 * task - task to be scheduled.
		 *
		 * firstTime - First time at which task is to be executed.
		 *
		 * period - time in milliseconds between successive task
		 * executions.
		 */
		timer.scheduleAtFixedRate(cleanUpTimerTask, firstTime, 1000);
		System.out.println("Timer has schedule the cleanUpTimerTask...");

		Thread.sleep(5000);

		System.out.println("Going to cancel...");
		timer.cancel();
		System.out.println("Canceled...");
	}

}
