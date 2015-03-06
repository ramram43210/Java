
public class AuthenticationFilter implements Filter
{

		@Override
        public void processRequest( String request )
        {
				System.out.println("Authenticating the request by AuthenticationFilter : " + request);
		        
        }

}
