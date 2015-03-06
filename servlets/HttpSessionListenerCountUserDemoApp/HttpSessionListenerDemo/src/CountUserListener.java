import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountUserListener implements HttpSessionListener
{
	ServletContext ctx = null;
	static int     totalUserCount = 0, currentUserCount = 0;

	public void sessionCreated( HttpSessionEvent httpSessionEvent )
	{
		System.out.println("sessionCreated method has been called in "
		        + this.getClass().getName());

		
		totalUserCount++;
		currentUserCount++;

		ctx = httpSessionEvent.getSession().getServletContext();
		
		ctx.setAttribute("totalusers", totalUserCount);
		ctx.setAttribute("currentusers", currentUserCount);

	}

	public void sessionDestroyed( HttpSessionEvent httpSessionEvent )
	{
		
		System.out.println("sessionDestroyed method has been called in "
		        + this.getClass().getName());		
		currentUserCount--;
		ctx.setAttribute("currentusers", currentUserCount);
	}

}
