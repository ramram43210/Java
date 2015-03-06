public abstract class User
{
		protected ChatMediator chatMediator;
		protected String       name;

		public User( ChatMediator chatMediator, String name )
		{
				this.chatMediator = chatMediator;
				this.name = name;
		}

		public abstract void send( String message );

		public abstract void receive( String message );
}