/*
 * public long getId()
 * 
 * Returns the identifier of this Thread. The thread ID
 * is a positive long number generated when this thread
 * was created. The thread ID is unique and remains
 * unchanged during its lifetime. When a thread is
 * terminated, this thread ID may be reused.
 * 
 * Returns: this thread's ID.
 */

class DisplayNumberThread extends Thread
{

	public void run()
	{
		System.out.println("id = " + this.getId() + ", Name = "
				+ this.getName());
	}

	public static void main(String args[])
	{
		DisplayNumberThread dnt1 = new DisplayNumberThread();
		DisplayNumberThread dnt2 = new DisplayNumberThread();
		DisplayNumberThread dnt3 = new DisplayNumberThread();
		dnt1.start();
		dnt2.start();
		dnt3.start();
	}
}