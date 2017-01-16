public class ThreadDemo
{

	public static void main(String args[]) throws InterruptedException
	{
		Thread t = new Thread(new MyRunnable());
		
		// this will call run() function
		t.start();
		
		// waits for this thread to die
		t.join();
		
		// tests if this thread is alive
		System.out.println(t.getName()+" - isAlive after join = " + t.isAlive());
	}
}