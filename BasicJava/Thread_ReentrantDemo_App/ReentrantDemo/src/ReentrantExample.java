public class ReentrantExample
{
	public static void main(String args[])
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				new DisplayMessage().displayName();
			}
		};
		t1.start();
	}
}