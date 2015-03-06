import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent)
	{
		System.out.println("\n###################################\n");

		System.out.println("sessionCreated method has been called in "
				+ this.getClass().getName());

		HttpSession session = httpSessionEvent.getSession();

		System.out.print(session + " Created:");

		System.out.println("ID=" + session.getId() + " MaxInactiveInterval="
				+ session.getMaxInactiveInterval());

		System.out.println("\n#####################################\n");

		/*
		 * if Session is created, based on that if you want to perform any
		 * operation then you can do it here.
		 */

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent)
	{
		System.out.println("\n###################################\n");

		System.out.println("sessionDestroyed method has been called in "
				+ this.getClass().getName());

		HttpSession session = httpSessionEvent.getSession();

		System.out.print(session + " destroyed:");

		System.out.println("ID=" + session.getId() + " MaxInactiveInterval="
				+ session.getMaxInactiveInterval());

		System.out.println("\n#####################################\n");

		/*
		 * if Session is destroyed, based on that if you want to perform any
		 * operation then you can do it here.
		 */

	}

}
