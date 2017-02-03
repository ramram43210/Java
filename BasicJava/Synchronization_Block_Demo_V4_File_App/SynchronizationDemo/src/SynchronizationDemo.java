public class SynchronizationDemo
{
	public static void main(String[] args)
	{
		DisplayCounter displayCounter = new DisplayCounter();

		DisplayThread thread1 = new DisplayThread("Thread1", displayCounter);
		DisplayThread thread2 = new DisplayThread("Thread2", displayCounter);

		thread1.start();
		thread2.start();
	}
}