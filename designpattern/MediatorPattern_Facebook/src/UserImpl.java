public class UserImpl extends User
{

		public UserImpl( FacebookGroupMediator mediator, String name )
		{
				super(mediator, name);
		}

		@Override
		public void send( String msg )
		{
				System.out.println(this.name + ": Sending Message=" + msg+"\n");
				mediator.sendMessage(msg, this);
		}

		@Override
		public void receive( String msg )
		{
				System.out.println(this.name + ": Received Message:" + msg);
		}

}