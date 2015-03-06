import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener
{

	public static int count = 0;

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent)
	{
		count++;

		System.out.println("\n###################################\n");

		System.out.println("requestInitialized method has been called in "
				+ this.getClass().getName());

		ServletRequest servletRequest = servletRequestEvent.getServletRequest();

		System.out.print(servletRequest + " is Created or Initialized:");

		System.out.println("\n#####################################\n");

		/*
		 * if request is created or initialized, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent)
	{
		System.out.println("\n###################################\n");

		System.out.println("requestDestroyed method has been called in "
				+ this.getClass().getName());

		ServletRequest servletRequest = servletRequestEvent.getServletRequest();

		System.out.print(servletRequest + " destroyed:");

		System.out.println("\n#####################################\n");

		/*
		 * if request is destroyed , based on that if you want to perform any
		 * operation then you can do it here.
		 */

	}

}
