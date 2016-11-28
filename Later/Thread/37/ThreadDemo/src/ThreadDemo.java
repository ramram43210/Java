public class ThreadDemo
{

	public static void main(String args[])
	{
		Thread t = new Thread(new MyRunnable());
		// this will call run() function
		t.start();
	}
}