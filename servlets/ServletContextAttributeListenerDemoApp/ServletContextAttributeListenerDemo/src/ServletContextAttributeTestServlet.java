import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextAttributeTestServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("-----------------------------------------");
		System.out.println(" Init method is called in "
		        + this.getClass().getName());
		System.out.println("--------------------------------------");
	}

	public void doGet( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		ServletContext servletContext = getServletContext();

		sleep();
		
		servletContext.setAttribute("CompanyName", "Wipro");

		sleep();

		servletContext.setAttribute("CompanyName", "Infosys");

		sleep();

		servletContext.removeAttribute("CompanyName");

	}

	private void sleep()
    {
	    try
		{
			Thread.sleep(10000);
		}
		catch( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public void destroy()
	{
		System.out.println("-----------------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}

}