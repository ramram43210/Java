import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CityInfoServlet extends HttpServlet
{

	private static final long serialVersionUID     = 1L;

	com.jolbox.bonecp.BoneCP  boneCPConnectionPool = null;

	public void init( ServletConfig config )
	{
		try
		{

			System.out
			        .println("-----------------------------------------------------");
			System.out
			        .println("init method has been called and servlet is initialized");
			
			boneCPConnectionPool = ConnectionManager.getConnectionPool();

			System.out.println("Got BoneCPConnectionPool : "
			        + boneCPConnectionPool);

			System.out
			        .println("-----------------------------------------------------");
		}

		catch( Exception exe )
		{
			exe.printStackTrace();
		}

	}

	public void doGet( HttpServletRequest request, HttpServletResponse response )
	        throws ServletException, IOException
	{

		System.out
		        .println("-----------------------------------------------------");
		System.out.println("doGet method has been called");
		System.out
		        .println("-----------------------------------------------------");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "City Information From Mysql Database";
		out.print("<html><body bgcolor=\"#f0f0f0\">");
		out.print("<h1 align=\"center\">" + title + "</h1>\n");

		showCityInformation(out);

		out.print("</body></html>");
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

	private void showCityInformation( PrintWriter out )
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try
		{

			String sql = "select * from city limit ?";

			/*
			 * Get connection from the DataSource
			 */

			connection = boneCPConnectionPool.getConnection();

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 10);

			ResultSet rs = preparedStatement.executeQuery();

			while( rs.next() )
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);

				/*
				 * Display values
				 */
				out.print("ID: " + id + "<br>");
				out.print("Name: " + name + "<br>");
				out.print("CountryCode: " + countryCode + "<br>");
				out.print("District: " + district + "<br>");
				out.println("Population: " + population + "<br>");
				out.println("--------------------------------------" + "<br>");
			}

			rs.close();

		}

		catch( Exception e )
		{
			e.printStackTrace();
		}
		finally
		{
			/*
			 * finally block used to close resources
			 */
			try
			{
				if( preparedStatement != null )
				{
					preparedStatement.close();
				}
			}
			catch( SQLException sqlException )
			{
				sqlException.printStackTrace();
			}
			try
			{
				if( connection != null )
				{
					connection.close();
				}
			}
			catch( SQLException sqlException )
			{
				sqlException.printStackTrace();
			}
		}

	}

}