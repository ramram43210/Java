import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter
{
		FilterConfig config;

		public void init( FilterConfig config ) throws ServletException
		{
				System.out.println("------------------------------------------------------");
				System.out.println(" init method is called in "
				                + this.getClass().getName());
				System.out.println("------------------------------------------------------");

				this.config = config;
		}

		public void doFilter( ServletRequest req, ServletResponse resp,
		                FilterChain chain ) throws IOException,
		                ServletException
		{

				PrintWriter out = resp.getWriter();

				String filterName = config.getFilterName();

				System.out.println("Filter Name : " + filterName + "\n");

				String isConstruction = config.getInitParameter("construction");

				if( isConstruction.equals("yes") )
				{
						out.print("This page is under construction");
				}
				else
				{
						/** sends request to next resource */
						chain.doFilter(req, resp);
				}

		}

		public void destroy()
		{
				// add code to release any resource
				System.out.println("------------------------------------------------------");
				System.out.println(" destroy method is called in "
				                + this.getClass().getName());
				System.out.println("------------------------------------------------------");
		}
}