class TaskOneThread extends Thread
{
	public void run()
	{
		System.out.println("task 1 run by = " + this.getName());
	}
}

class TaskTwoThread extends Thread
{
	public void run()
	{
		System.out.println("task 2 run by = " + this.getName());
	}
}

/*
 * How to perform multiple tasks by multiple threads
 * (multitasking in multithreading)?
 * 
 * Program of performing two tasks by two threads
 */
public class MultitaskingThread
{

	public static void main(String args[]) throws InterruptedException
	{
		TaskOneThread t1 = new TaskOneThread();
		TaskTwoThread t2 = new TaskTwoThread();

		t1.start();
		t2.start();
	}

}