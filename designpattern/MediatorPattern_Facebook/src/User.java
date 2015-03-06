public abstract class User
{
		protected FacebookGroupMediator mediator;
		protected String       name;

		public User( FacebookGroupMediator mediator, String name )
		{
				this.mediator = mediator;
				this.name = name;
		}

		public abstract void send( String msg );

		public abstract void receive( String msg );
}