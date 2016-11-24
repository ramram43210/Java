/*
 * public int activeCount()
 * 
 * Returns an estimate of the number of active threads
 * in this thread group and its subgroups.
 */
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
		t3.start();
		Thread t4 = new Thread(childTg, myRunnable, "thread4");
		t4.start();
		Thread t5 = new Thread(childTg, myRunnable, "thread5");
		t5.start();

		// display the number of active threads
		System.out.println("Active threads in \"" + childTg.getName() + "\" = "
				+ childTg.activeCount());

		// display the number of active threads
		System.out.println("Active threads in \"" + parentTg.getName()
				+ "\" = " + parentTg.activeCount());

	}
}