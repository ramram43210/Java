
public class LoggingFilter implements Filter
{
		@Override
        public void processRequest( String request )
        {
				System.out.println("Request Tracking is done by LoggingFilter : " + request);		        
        }
}
