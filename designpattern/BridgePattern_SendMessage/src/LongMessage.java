public class LongMessage extends Message
{

	public LongMessage(MessageSender messageSender)
	{
		super.messageSender = messageSender;
	}

	@Override
	public void sendMessage(String message)
	{
		messageSender.sendMessage(message);
	}

}
