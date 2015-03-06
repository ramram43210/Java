import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet
{
		ServletConfig config = null;

		public void init( ServletConfig config )
		{
				this.config = config;
				System.out.println("-----------------------------------------------------");
				System.out.println("init method has been called and servlet is initialized");
				System.out.println("-----------------------------------------------------");
		}

		public void service( ServletRequest req, ServletResponse res ) throws IOException, ServletException
		{
				System.out.println("-----------------------------------------------------");
				System.out.println("service method has been called");
				System.out.println("-----------------------------------------------------");

				res.setContentType("text/html");

				PrintWriter out = res.getWriter();
				out.print("<html><body>");
				out.print("<b>hello simple servlet</b>");
				out.print("<br>");
				out.print("<b>Servlet Info :</b> "+getServletInfo());
				out.print("<br>");
				out.print("<b>Get Servlet config object :</b> "+getServletConfig());
				
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
				return config;
		}

		public String getServletInfo()
		{
				return "copyright 2014-01-01 version : 3.0";
		}

}