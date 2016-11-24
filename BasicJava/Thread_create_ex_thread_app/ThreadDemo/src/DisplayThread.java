class DisplayThread extends Thread
{

	public static void main(String args[])
	{
		/*
		 * Allocates a new Thread object.
		 */
		DisplayThread displayThread = new DisplayThread();
		/*
		 * Causes this thread to begin execution; the Java
		 * Virtual Machine calls the run method of this
		 * thread
		 */
		displayThread.start();
	}

	/*
	 * Subclasses of Thread should override run() method.
	 */
	@Override
	public void run()
	{
		System.out.println("Welcome to india");
	}
}