import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	private String message;

	public void init() throws ServletException
	{

		System.out
		        .println("\n****************************************************************************\n");
		System.out
		        .println("HelloWorld servlet init method has been called ..... ");
		System.out
		        .println("\n****************************************************************************\n");

		message = "Hello World";
	}

	public void service(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		System.out
		        .println("\n****************************************************************************\n");
		System.out
		        .println("HelloWorld servlet service method has been called ..... ");
		System.out
		        .println("\n****************************************************************************\n");

		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException
	{
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	public void destroy()
	{
		// do nothing.
	}
}