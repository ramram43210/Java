/*
 * public final boolean parentOf(ThreadGroup g)
 * 
 * Tests if this thread group is either the thread group
 * argument or one of its ancestor thread groups.
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

		// determine which ThreadGroup is parent
		boolean isParent = parentTg.parentOf(childTg);
		System.out.println(parentTg.getName() + " is the parent of "
				+ childTg.getName() + "? " + isParent);

		isParent = childTg.parentOf(parentTg);
		System.out.println(childTg.getName() + " is the parent of "
				+ parentTg.getName() + "? " + isParent);

	}
}