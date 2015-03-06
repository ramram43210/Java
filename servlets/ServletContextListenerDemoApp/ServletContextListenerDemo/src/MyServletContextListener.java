import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener
{

	@Override
	public void contextInitialized( ServletContextEvent servletContextEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("contextInitialized method has been called in "
		        + this.getClass().getName());

		ServletContext servletContext = servletContextEvent.getServletContext();

		System.out.println(servletContext + " is Initialized or Created");

		System.out.println("\n#####################################\n");

		/*
		 * If ServletContext is created, based on that if you want to perform
		 * any operation then you can do it here.
		 */

	}

	@Override
	public void contextDestroyed( ServletContextEvent servletContextEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("contextDestroyed method has been called in "
		        + this.getClass().getName());

		ServletContext servletContext = servletContextEvent.getServletContext();

		System.out.println(servletContext + " is destroyed");

		System.out.println("\n#####################################\n");

		/*
		 * If ServletContext is Destroyed, based on that if you want to perform
		 * any operation then you can do it here.
		 */

	}

}
