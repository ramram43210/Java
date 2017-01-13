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

		t1.start();

		ThreadGroup childTg = new ThreadGroup(parentTg, "Child ThreadGroup");

		Thread t2 = new Thread(childTg, myRunnable, "thread2");
		
		t2.start();

		// determine which ThreadGroup is parent
		boolean isParent = parentTg.parentOf(childTg);
		System.out.println(parentTg.getName() + " is the parent of "
				+ childTg.getName() + "? " + isParent);

		isParent = childTg.parentOf(parentTg);
		System.out.println(childTg.getName() + " is the parent of "
				+ parentTg.getName() + "? " + isParent);

	}
}