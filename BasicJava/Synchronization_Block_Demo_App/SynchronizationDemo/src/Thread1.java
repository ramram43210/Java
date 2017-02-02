public class Thread1 extends Thread
{
	private Table t;

	public Thread1(Table t,String threadName)
	{
		super(threadName);
		this.t = t;
	}

	public void run()
	{
		t.printTable(5);
	}

}
