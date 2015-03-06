abstract class Message
{

		protected MessagePublisher messagePublisher;

		protected MessagePublisher getMessagePublisher()
		{
				return messagePublisher;
		}

		protected void setMessagePublisher( MessagePublisher messagePublisher )
		{
				this.messagePublisher = messagePublisher;
		}

		abstract public void publishMessage(String message);

}
