
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class
public class ServletsLifeCycle extends HttpServlet
{

		private static final long serialVersionUID = 1L;
		private int i;

		public void init() throws ServletException
		{
				System.out.println("------------------------------------------------------");
				System.out.println(" Init method is called ");
				System.out.println("------------------------------------------------------");
		}

		public void service( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
		{
				++i;
				System.out.println(" service method is called "+i+ " time");
				// Set response content type
				response.setContentType("text/html");

				// Actual logic goes here.
				PrintWriter out = response.getWriter();
				out.println("<h1>" + " service method is called "+i+ " time" + "</h1>");
		}

		public void destroy()
		{
				System.out.println("------------------------------------------------------");
				System.out.println(" destroy method is called ");
				System.out.println("------------------------------------------------------");
		}
}