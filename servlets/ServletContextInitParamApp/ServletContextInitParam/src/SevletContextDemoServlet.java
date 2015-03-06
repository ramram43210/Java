import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SevletContextDemoServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out
		        .println("------------------------------------------------------");
		System.out.println(" Init method is called in "
		        + this.getClass().getName());
		System.out
		        .println("------------------------------------------------------");
	}

	// Method to handle GET method request.
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
		                IOException
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			ServletContext context = getServletContext();

			out.print("<b>Read specfic initParam using context.getInitParameter(String paramName )</b> <br><br>");

			String driverName=context.getInitParameter("drivername");
			out.print(driverName+"<br><br>");


			out.print("<b>Read All InitParameters using getInitParameterNames() method</b> <br>");

			Enumeration<String> initParamNamesEnum = context.getInitParameterNames();
			String paramName = "";
			while( initParamNamesEnum.hasMoreElements() )
			{
					paramName = initParamNamesEnum.nextElement();
					String paramValue = context.getInitParameter(paramName);
					out.print("<br> " +paramName +" : "+ paramValue);
			}
	}

	// Method to handle POST method request.
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		doGet(request, response);
	}

	public void destroy()
	{
		System.out
		        .println("------------------------------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out
		        .println("------------------------------------------------------");
	}
}