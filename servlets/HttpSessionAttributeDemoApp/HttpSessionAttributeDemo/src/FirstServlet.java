import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("----------------------------------------------");
		System.out.println(" Init method is called in "
				+ this.getClass().getName());
		System.out.println("--------------------------------------------");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		out.print("Welcome " + username);

		HttpSession session = request.getSession();
		System.out.println("FirstServlet sessionid :" + session.getId());
		session.setAttribute("Username", username);
		session.setAttribute("Role", "Admin");

		out.print("<a href='servlet2'> : visit</a>");

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