/**
 *
 * We are using predefined functional interface Runnable and referring
 * a static method ThreadStatus() to it's functional method run().
 *
 */

public class MethodReferenceDemo
{
	public static void ThreadStatus()
	{
		System.out.println("Thread is running...");
	}

	public static void main(String[] args)
	{
		Runnable runnable = MethodReferenceDemo::ThreadStatus;
		Thread thread = new Thread(runnable);
		thread.start();
	}
}