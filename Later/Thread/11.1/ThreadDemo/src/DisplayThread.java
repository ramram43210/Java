class DisplayThread extends Thread
{

	public static void main(String args[])
	{
		DisplayThread displayThread = new DisplayThread();

		/*
		 * fine, but does not start a separate call stack
		 */
		displayThread.run();

	}

	public void run()
	{
		System.out.println("Hello by ");
	}

}