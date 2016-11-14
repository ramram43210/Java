public class MainThread
{

	public static void main(String[] args)
	{
		Thread thread = Thread.currentThread();
		thread.setName("MainThread");
		System.out.println("Name of thread = " + thread);
	}

}
