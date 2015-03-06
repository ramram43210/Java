import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigServlet extends HttpServlet
{

		private static final long serialVersionUID = 1L;

		ServletConfig             servletConfig           = null;

		public void init( ServletConfig servletConfig )
		{
				this.servletConfig = servletConfig;
				System.out.println("\n-----------------------------------------------------");
				System.out.println("init method has been called and servlet is initialized");
				System.out.println("-----------------------------------------------------");

				System.out.println("Using 'getInitParameter(String name)' method get the value");
				String driverName = servletConfig.getInitParameter("driverName");
				System.out.println("Driver Name : " + driverName);

				System.out.println("\nUsing 'getInitParameterNames()'  method get the value");
				Enumeration<String> paramNames = servletConfig.getInitParameterNames();

				while( paramNames.hasMoreElements() )
				{
						String paramName = paramNames.nextElement();

						String value = servletConfig.getInitParameter(paramName);

						System.out.println("paramName : " + paramName + ", Value: " + value);

				}

		}

		public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
		{

				System.out.println("\n-----------------------------------------------------");
				System.out.println("doGet method has been called");
				System.out.println("-----------------------------------------------------");

				ServletConfig servletConfig = getServletConfig();
				System.out.println("Got servletconfig object using getServletConfig() method : " + servletConfig);
				System.out.println("Servlet Name : " + servletConfig.getServletName());
				System.out.println("ServletContext Object : " + servletConfig.getServletContext());

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

		public ServletConfig getServletConfig()
		{
				return servletConfig;
		}
}