public class LongMessage extends Message
{

		@Override
		public void publishMessage( String message )
		{
				messagePublisher.publishMessage(message);
		}

}
