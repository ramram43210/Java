import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloHttpServlet extends HttpServlet
{

		private static final long serialVersionUID = 1L;

		ServletConfig             config           = null;

		public void init( ServletConfig config )
		{
				this.config = config;
				System.out.println("-----------------------------------------------------");
				System.out.println("init method has been called and servlet is initialized");
				System.out.println("-----------------------------------------------------");
		}

		public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
		{

				System.out.println("-----------------------------------------------------");
				System.out.println("doGet method has been called");
				System.out.println("-----------------------------------------------------");

				response.setContentType("text/html");

				PrintWriter out = response.getWriter();
				out.print("<html><body>");
				out.print("<b>hello HTTP servlet</b>");
				out.print("</body></html>");
		}

		public void destroy()
		{
				System.out.println("-----------------------------------------------------");
				System.out.println("destroy method has been called and servlet is destroyed");
				System.out.println("-----------------------------------------------------");
		}

}