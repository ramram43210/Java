class TaskOneRunnable implements Runnable
{
	
	public void run()
	{
		System.out.println("task 1 run by = "
				+ Thread.currentThread().getName());
	}
}

class TaskTwoRunnable implements Runnable
{
	public void run()
	{
		System.out.println("task 2 run by = "
				+ Thread.currentThread().getName());
	}
}

public class MultitaskingRunnable
{

	public static void main(String[] args)
	{
		TaskOneRunnable taskOneRunnable = new TaskOneRunnable();
		TaskTwoRunnable taskTwoRunnable = new TaskTwoRunnable();

		Thread t1 = new Thread(taskOneRunnable,"Task One Thread");
		Thread t2 = new Thread(taskTwoRunnable,"Task two Thread");

		t1.start();
		t2.start();

	}

}
