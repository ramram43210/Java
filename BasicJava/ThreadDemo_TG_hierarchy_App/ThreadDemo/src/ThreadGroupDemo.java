public class ThreadGroupDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyRunnable myRunnable = new MyRunnable();

		ThreadGroup parentTg = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(parentTg, myRunnable, "thread1");
		Thread t2 = new Thread(parentTg, myRunnable, "thread2");

		t1.start();
		t2.start();

		ThreadGroup childTg = new ThreadGroup(parentTg, "Child ThreadGroup");

		Thread t3 = new Thread(childTg, myRunnable, "thread3");
		Thread t4 = new Thread(childTg, myRunnable, "thread4");
		Thread t5 = new Thread(childTg, myRunnable, "thread5");

		t3.start();
		t4.start();
		t5.start();

	}
}