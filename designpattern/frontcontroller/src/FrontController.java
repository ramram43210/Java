public class FrontController
{
		private Dispatcher dispatcher;

		public FrontController()
		{
				dispatcher = new Dispatcher();
		}

		private boolean isAuthenticUser()
		{
				//here you have to write Authentication logic
				System.out.println("User is authenticated successfully.");
				return true;
		}

		private void trackRequest( String request )
		{
				System.out.println("Page requested: " + request);
		}

		public void dispatchRequest( String request )
		{
				// log each request
				trackRequest(request);
				// authenticate the user
				if( isAuthenticUser() )
				{
						dispatcher.dispatch(request);
				}
		}
}
