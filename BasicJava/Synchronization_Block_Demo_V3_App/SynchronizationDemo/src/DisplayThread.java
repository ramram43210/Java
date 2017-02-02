public class DisplayThread extends Thread
{
	private String msg;
	private DisplayMessage displayMessage;

	public DisplayThread(DisplayMessage displayMessage, String msg)
	{
		this.displayMessage = displayMessage;
		this.msg = msg;
	}

	public void run()
	{
		displayMessage.showMessage(msg);
	}
}
