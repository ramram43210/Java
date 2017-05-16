/**
 * With JDK 8
 * 
 * Java Lambda Expression Example: Creating Thread
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		/*
		 * Thread Example with lambda.
		 * 
		 * we are implementing run method by using lambda expression.
		 */

		Runnable runnable = () -> {
			System.out.println("Thread is running...");
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
