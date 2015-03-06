import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	
    private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("-----------------------------------------");
		System.out.println(" Init method is called in "
		        + this.getClass().getName());
		System.out.println("--------------------------------------");
	}
	
	public void doGet( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		out.print("Welcome " + userName);

		HttpSession session = request.getSession();
		session.setAttribute("uname", userName);

		ServletContext ctx = getServletContext();
		int totalUsers = (Integer) ctx.getAttribute("totalusers");
		int currentUsers = (Integer) ctx.getAttribute("currentusers");
		
		out.print("<br>total users= " + totalUsers);
		out.print("<br>current users= " + currentUsers);

		out.print("<br><a href='logout'>logout</a>");

		out.close();
	}
	
	public void destroy()
	{
		System.out.println("-----------------------------------------");
		System.out.println(" destroy method is called in "
		        + this.getClass().getName());
		System.out.println("-----------------------------------------");
	}

}
