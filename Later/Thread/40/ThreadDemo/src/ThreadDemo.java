public class ThreadDemo
{

	public static void main(String args[]) throws InterruptedException
	{
		new MyRunnable("Thread 1");
		new MyRunnable("Thread 2");
		new MyRunnable("Thread 3");
	}
}