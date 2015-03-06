import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{
		private static final long serialVersionUID = 1L;

		public void init() throws ServletException
		{
				System.out.println("------------------------------------------------------");
				System.out.println(" Init method is called in "
				                + this.getClass().getName());
				System.out.println("------------------------------------------------------");
		}

		public void doGet( HttpServletRequest request,
		                HttpServletResponse response ) throws ServletException,
		                IOException
		{

				System.out.println(" doGet method is called in "
				                + this.getClass().getName() + "\n\n");
				System.out.println("------------------------------------------------------");

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();

				out.print("<br>welcome to helloservlet<br>");

		}

		public void destroy()
		{
				System.out.println("------------------------------------------------------");
				System.out.println(" destroy method is called in "
				                + this.getClass().getName());
				System.out.println("------------------------------------------------------");
		}

}