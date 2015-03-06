public class Facebook implements MessagePublisher
{

		public void publishMessage(String message)
		{
				System.out.println("'"+message+ "' : This message has been published to public in Facebook Social networking site");
		}
}
