public class DisplayThread extends Thread
{
	private DisplayCounter dc;

	public DisplayThread(String name, DisplayCounter dc)
	{
		super.setName(name);
		this.dc = dc;
	}

	public void run()
	{
		dc.printCount();
	}

}
