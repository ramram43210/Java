/**
 *
 * We are using predefined functional interface Runnable and referring
 * a non-static method ThreadStatus() to it's functional method run().
 *
 */

public class MethodReferenceDemo
{
	public void ThreadStatus()
	{
		System.out.println("Thread is running...");
	}

	public static void main(String[] args)
	{
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		Runnable runnable = methodReferenceDemo::ThreadStatus;
		Thread thread = new Thread(runnable);
		thread.start();
	}
}