public class UserImpl extends User
{

		public UserImpl( ChatMediator chatMediator, String name )
		{
				super(chatMediator, name);
		}

		@Override
		public void send( String message )
		{
				System.out.println(this.name + ": Sending Message=" + message+"\n");
				chatMediator.sendMessage(message, this);
		}

		@Override
		public void receive( String message )
		{
				System.out.println(this.name + ": Received Message:" + message);
		}

}