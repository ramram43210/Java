public class SynchronizationDemo
{
	public static void main(String[] args)
	{
		DisplayMessage displayMessage = new DisplayMessage();
		DisplayThread thread1 = new DisplayThread(displayMessage, "welcome");
		DisplayThread thread2 = new DisplayThread(displayMessage, "Hello");
		DisplayThread thread3 = new DisplayThread(displayMessage, "Peter");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}