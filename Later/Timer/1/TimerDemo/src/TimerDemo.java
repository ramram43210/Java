import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args)
	{

		/*
		 * Creating timer task
		 */
		TimerTask myTimerTask = new MyTimerTask();

		/*
		 * Creates a new timer. The associated thread does not run as
		 * a daemon.
		 */
		Timer timer = new Timer();

		Date scheduleDateTime = new Date(System.currentTimeMillis() + 5000);
		System.out.println("scheduleDateTime = " + scheduleDateTime);

		/*
		 * Schedules the specified task for execution at the specified
		 * time. If the time is in the past, the task is scheduled for
		 * immediate execution.
		 *
		 * Parameters:
		 *
		 * task - task to be scheduled.
		 *
		 * time - time at which task is to be executed.
		 */
		timer.schedule(cleanuptask?, scheduleDateTime);
		System.out.println("Timer has schedule the --------------------myTimerTask...");
	}

}
