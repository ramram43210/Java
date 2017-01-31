import java.io.IOException;

public class SynchronizationDemo
{

	public static void main(String[] args) throws IOException
	{
		Table tableObj = new Table();

		/*
		 * Created the two threads by annonymous class.
		 */
		Thread t1 = new Thread("Thread 1")
		{
			public void run()
			{
				tableObj.printTable(5);
			}
		};
		Thread t2 = new Thread("Thread 2")
		{
			public void run()
			{
				tableObj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}

}
