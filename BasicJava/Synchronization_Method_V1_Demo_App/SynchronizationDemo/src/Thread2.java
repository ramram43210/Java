public class Thread2 extends Thread
{
	private Table t;

	public Thread2(Table t,String threadName)
	{
		super(threadName);
		this.t = t;
	}

	public void run()
	{
		t.printTable(50);
	}

}
