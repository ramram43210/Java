class DisplayNumberThread extends Thread
{

	public static void main(String args[])
	{
		DisplayNumberThread dnt1 = new DisplayNumberThread();
		DisplayNumberThread dnt2 = new DisplayNumberThread();

		System.out.println("Before setting the thread name.");
		System.out.println("dnt1 thread Name = " + dnt1.getName());
		System.out.println("dnt2 thread Name = " + dnt2.getName());

		dnt1.start();
		dnt2.start();

		/*
		 * Changes the name of this thread to be equal to
		 * the argument name.
		 */
		dnt1.setName("DisplayNumberThread1");
		dnt2.setName("DisplayNumberThread2");

		System.out.println("\nAfter setting the thread name.");
		System.out.println("dnt1 thread Name = " + dnt1.getName());
		System.out.println("dnt2 thread Name = " + dnt2.getName());

	}

	public void run()
	{
		System.out.println("Hi");
	}
}