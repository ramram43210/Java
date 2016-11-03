public class HelloThread extends Thread
{

	public static void main(String args[])
	{
		HelloThread helloThread = new HelloThread();
		helloThread.start();
	}

	public void run()
	{
		/*
		 * Returns this thread's name.
		 */
		System.out.println("Thread Name = " + this.getName());
	}

}