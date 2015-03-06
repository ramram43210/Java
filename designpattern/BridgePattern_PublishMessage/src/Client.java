import java.util.Scanner;

public class Client
{

		public static void main( String[] args )
		{

				System.out.println("Please enter the Social networking site you want to use to publish the message  : 'Twitter' or 'Facebook' or 'GooglePlus'");
				Scanner scanner = new Scanner(System.in);
				String socialNetworkingSite = scanner.next();
				
				System.out.println("Please enter the message you want to publish");
				Scanner scanner1 = new Scanner(System.in);
				String message = scanner1.nextLine();

				if( "Twitter".equalsIgnoreCase(socialNetworkingSite) )
				{
						ShortMessage shortMessage = new ShortMessage();
						shortMessage.setMessagePublisher(new Twitter());
						shortMessage.publishMessage(message);
				}
				else if( "Facebook".equalsIgnoreCase(socialNetworkingSite) )
				{
						LongMessage longMessage = new LongMessage();
						longMessage.setMessagePublisher(new Facebook());
						longMessage.publishMessage(message);
				}
				else if( "GooglePlus".equalsIgnoreCase(socialNetworkingSite) )
				{
						LongMessage longMessage = new LongMessage();
						longMessage.setMessagePublisher(new GooglePlus());
						longMessage.publishMessage(message);
				}

		}
}
