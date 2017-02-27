@FunctionalInterface
interface Message
{
	String displayMessage(String strValue);
}

/**
 * Java Lambda Expression Example: Creating Thread
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		// Thread Example without lambda
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("Thread1 is running...");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		/*
		 * Thread Example with lambda.
		 * 
		 * we are implementing run method by using lambda expression.
		 */

		Runnable r2 = () -> {
			System.out.println("Thread2 is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
