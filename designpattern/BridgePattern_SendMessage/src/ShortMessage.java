public class ShortMessage extends Message
{
	public ShortMessage(MessageSender messageSender)
	{
		super.messageSender = messageSender;
	}
	
	@Override
	public void sendMessage(String message)
	{
		if(message.length()<=5)
		{
			messageSender.sendMessage(message);
		}
		else
		{
			System.out.println("Sorry cannot send the message.....");
		}
	}

}
