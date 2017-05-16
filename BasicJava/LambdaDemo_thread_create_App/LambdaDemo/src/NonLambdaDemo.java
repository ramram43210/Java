/**
 * Before JDK 8
 *
 */
public class NonLambdaDemo
{

	public static void main(String[] args)
	{
		// Thread Example without lambda
		Runnable runnable = new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("Thread is running...");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
