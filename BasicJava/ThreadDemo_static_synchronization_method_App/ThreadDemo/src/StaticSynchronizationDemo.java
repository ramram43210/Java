class Table
{

	/*
	 * We are applying synchronized keyword on the static
	 * method to perform static synchronization.
	 */
	synchronized static void printTable(int n)
	{
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(n * i);
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{
			}
		}
		System.out.println("------------------------");
	}
}

class MyThread1 extends Thread
{
	public void run()
	{
		Table.printTable(1);
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		Table.printTable(10);
	}
}

public class StaticSynchronizationDemo
{
	public static void main(String t[])
	{
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();

	}
}