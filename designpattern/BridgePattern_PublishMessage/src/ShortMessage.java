public class ShortMessage extends Message
{

		private static int MESSAGE_LENGTH = 200;

		@Override
		public void publishMessage( String message )
		{
				if( message.length() <= MESSAGE_LENGTH )
				{
						messagePublisher.publishMessage(message);
				}
				else
				{
						System.out.println("Sorry message length is more cann't publish.....");
				}

		}

}
