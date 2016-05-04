public class FinalizeDemo
{

	private String name = null;

	public FinalizeDemo(String name)
	{
		super();
		this.name = name;
	}

	public static void main(String[] args)
			throws InterruptedException
	{
		FinalizeDemo FinalizeDemo1 = new FinalizeDemo("FinalizeDemo1");
		FinalizeDemo1 = null;
		FinalizeDemo FinalizeDemo2 = new FinalizeDemo("FinalizeDemo2");
		FinalizeDemo1 = null;
		FinalizeDemo2 = null;
		System.gc();
		Thread.sleep(100);
	}

	public void finalize()
	{
		System.out.println(this.name
				+ " Object finalize method is called");
	}

}
