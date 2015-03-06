import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBoxServlet extends HttpServlet
{

		private static final long serialVersionUID = 1L;

		public void init()
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("init method has been called and servlet is initialized");
			System.out.println("-----------------------------------------------------");
		}
		
		// Method to handle GET method request.
		public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
		{
				// Set response content type
				response.setContentType("text/html");

				PrintWriter out = response.getWriter();
				
				out.println("\nRead data using '<b>String[] getParameterValues(String name)</b>' method \n");
				
				String[] values = request.getParameterValues("bookname");

				out.println("<br><br>Selected Books are : <br>");
				
				out.println("<ul>");

				for( String value : values )
                {
						out.print(" <li><b>" + value + "</b>");
                }

				out.println("</ul>");
		}

		// Method to handle POST method request.
		public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
		{
				doGet(request, response);
		}
		
		public void destroy()
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("destroy method has been called and servlet is destroyed");
			System.out.println("-----------------------------------------------------");
		}
}