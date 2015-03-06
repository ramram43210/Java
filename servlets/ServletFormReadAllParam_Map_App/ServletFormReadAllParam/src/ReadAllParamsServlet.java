import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadAllParamsServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void init()
	{
		System.out
		        .println("-----------------------------------------------------");
		System.out
		        .println("init method has been called and servlet is initialized");
		System.out
		        .println("-----------------------------------------------------");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Reading All Form Parameters";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
		        + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
		        + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
		        + "<h1 align=\"center\">" + title + "</h1>\n"
		        + "<table width=\"100%\" border=\"1\" align=\"center\">\n"
		        + "<tr bgcolor=\"#949494\">\n"
		        + "<th>Param Name</th><th>Param Value(s)</th>\n" + "</tr>\n");

		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> paramNameSet = paramMap.keySet();

		for (String paramName : paramNameSet)
		{

			out.print("<tr><td>" + paramName + "</td>\n<td>");
			String[] paramValues = request.getParameterValues(paramName);
			// Read single valued data
			if (paramValues.length == 1)
			{
				String paramValue = paramValues[0];
				if (paramValue.length() == 0)
				{
					out.println("<i>No Value</i>");
				}
				else
				{
					out.println(paramValue);
				}
			}
			else
			{
				// Read multiple valued data
				out.println("<ul>");
				for (int i = 0; i < paramValues.length; i++)
				{
					out.println("<li>" + paramValues[i]);
				}
				out.println("</ul>");
			}
		}
		out.println("</tr>\n</table>\n</body></html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		doGet(request, response);
	}

	public void destroy()
	{
		System.out
		        .println("-----------------------------------------------------");
		System.out
		        .println("destroy method has been called and servlet is destroyed");
		System.out
		        .println("-----------------------------------------------------");
	}
}