import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerInfoServlet extends HttpServlet
{

		private static final long serialVersionUID = 1L;
		
		public void init()
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("init method has been called and servlet is initialized");
			System.out.println("-----------------------------------------------------");
		}

		public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
		{

			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			out.println("Read data using  '<b>String getParameter(String name)</b>' method");

			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
			out.println(docType + "<html>\n" + "<head><title>" + "GET" + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n" + "<ul>\n" + "  <li><b>First Name</b>: " + request.getParameter("first_name")
			        + "\n" + "  <li><b>Last Name</b>: " + request.getParameter("last_name") + "\n" + "</ul>\n" + "</body></html>");

			out.println("\nRead data using '<b>Enumeration getParameterNames()</b>' method \n");

			Enumeration<String> paramNames = request.getParameterNames();

			out.println("<ul>");

			while (paramNames.hasMoreElements())
			{

				String paramName = paramNames.nextElement();
				out.print(" <li><b>" + paramName + ":</b>");
				String paramValue = request.getParameter(paramName);
				out.println(paramValue + "</li>");

			}

			out.println("</ul>");

			out.println("\nRead data using '<b>Map getParameterMap()</b>' method\n");

			Map<String, String[]> paramMap = request.getParameterMap();

			Set<String> paramNamesSet = paramMap.keySet();

			out.println("<ul>");
			for (String paramName : paramNamesSet)
			{
				out.print(" <li><b>" + paramName + ":</b>");
				String[] paramValue = paramMap.get(paramName);
				for (int i = 0; i < paramValue.length; i++)
				{
					out.println(paramValue[i] + "</li>");
				}

			}
			out.println("</ul>");
		}
		

		public void destroy()
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("destroy method has been called and servlet is destroyed");
			System.out.println("-----------------------------------------------------");
		}
}