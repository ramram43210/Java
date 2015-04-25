import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
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
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		out.print("Welcome " + userName);

		// creating form that have invisible textfield
		out.print("<form action='servlet2'>");
		out.print("<input type='hidden' name='userName' value='" + userName
		        + "'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		out.close();
	}

	public void destroy()
	{
		System.out.println("-----------------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}

}