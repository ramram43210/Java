import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("----------------------------------------------");
		System.out.println(" Init method is called in "
				+ this.getClass().getName());
		System.out.println("----------------------------------------------");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();

		System.out.println("Second Servlet sessionid :" + session.getId());

		String userName = (String) session.getAttribute("Username");
		out.print("Hello " + userName + "<br>");

		out.print("*************************************************************"
				+ "<br>");

		Enumeration<String> namesEnum = session.getAttributeNames();
		while (namesEnum.hasMoreElements())
		{
			String name = (String) namesEnum.nextElement();
			String value = (String) session.getAttribute(name);
			out.print(name + ":" + value);
			out.print("<br>");

		}

		out.close();
	}

	public void destroy()
	{
		System.out.println("----------------------------------------------");
		System.out.println(" destroy method is called in "
				+ this.getClass().getName());
		System.out.println("----------------------------------------------");
	}

}