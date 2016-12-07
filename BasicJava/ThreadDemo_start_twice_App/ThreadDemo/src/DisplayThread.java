class DisplayThread extends Thread
{

	public static void main(String args[])
	{
		DisplayThread displayThread = new DisplayThread();

		displayThread.start();
		displayThread.start();
	}

	public void run()
	{
		System.out.println("Hello by = " + this.getName());
	}

}