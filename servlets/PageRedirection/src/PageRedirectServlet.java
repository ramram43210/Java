import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageRedirectServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("---------------------------");
		System.out.println(" Init method is called in "
				+ this.getClass().getName());
		System.out.println("---------------------------");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// Set response content type
		response.setContentType("text/html");

		// New location to be redirected
		String site = new String("http://www.google.com");

		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", site);
	}

	public void destroy()
	{
		System.out.println("---------------------------");
		System.out.println(" destroy method is called in "
				+ this.getClass().getName());
		System.out.println("---------------------------");
	}
}