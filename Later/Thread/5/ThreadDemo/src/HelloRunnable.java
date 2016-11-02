public class HelloRunnable implements Runnable
{

	public static void main(String args[])
	{
		HelloRunnable helloRunnable = new HelloRunnable();
		Thread thread = new Thread(helloRunnable);
		thread.start();
	}

	@Override
	public void run()
	{
		System.out.println("Hello from a thread!");
	}
}