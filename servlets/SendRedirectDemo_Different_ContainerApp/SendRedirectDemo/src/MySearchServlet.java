import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySearchServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("----------------------------------");
		System.out.println(" Init method is called in "
		        + this.getClass().getName());
		System.out.println("----------------------------------");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		String searchKey = request.getParameter("searchKey");
		response.sendRedirect("https://www.google.co.in/#q=" + searchKey);
	}

	public void destroy()
	{
		System.out.println("----------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out.println("----------------------------------");
	}
}