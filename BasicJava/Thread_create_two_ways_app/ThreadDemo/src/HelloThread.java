public class HelloThread extends Thread
{

	public static void main(String args[])
	{
		HelloThread helloThread = new HelloThread();
		helloThread.start();
	}
	
	@Override
	public void run()
	{
		System.out.println("Hello from a thread!");
	}

}