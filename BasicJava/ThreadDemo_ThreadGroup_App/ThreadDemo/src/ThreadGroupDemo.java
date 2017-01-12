public class ThreadGroupDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		MyRunnable myRunnable = new MyRunnable();

		ThreadGroup tg = new ThreadGroup("Group A");

		Thread t1 = new Thread(tg, myRunnable, "thread1");
		Thread t2 = new Thread(tg, myRunnable, "thread2");
		Thread t3 = new Thread(tg, myRunnable, "thread3");

		t1.start();
		t2.start();
		t3.start();

		/*
		 * Returns the name of this thread group.
		 */
		String threadGroupName = tg.getName();
		System.out.println("Thread Group Name: " + threadGroupName);
		/*
		 * Prints information about this thread group to the
		 * standard output.
		 */
		tg.list();

	}
}