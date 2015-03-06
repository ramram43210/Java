import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayHeadersServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{

		System.out.println("\n*******************************************\n");
		System.out.println("HelloWorld servlet init method has been called");
		System.out.println("\n*******************************************\n");

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "HTTP Header Request Example";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
		        + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
		        + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
		        + "<h1 align=\"center\">" + title + "</h1>\n"
		        + "<table width=\"100%\" border=\"1\" align=\"center\">\n"
		        + "<tr bgcolor=\"#949494\">\n"
		        + "<th>Header Name</th><th>Header Value(s)</th>\n" + "</tr>\n");

		Enumeration<String> headerNames = request.getHeaderNames();

		while (headerNames.hasMoreElements())
		{
			String headerName = (String) headerNames.nextElement();
			out.print("<tr><td>" + headerName + "</td>\n");
			String headerValue = request.getHeader(headerName);
			out.println("<td> " + headerValue + "</td></tr>\n");
		}
		out.println("</table>\n</body></html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		doGet(request, response);
	}

	public void destroy()
	{
		// do nothing.
	}
}