import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jolbox.bonecp.BoneCPDataSource;

public class EmployeeInfoServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	BoneCPDataSource          boneCPDataSource = null;

	public void init( ServletConfig config )
	{
		try
		{

			System.out
			        .println("-----------------------------------------------------");
			System.out
			        .println("init method has been called and servlet is initialized");

			boneCPDataSource = ConnectionManager.getBoneCPDataSource();

			System.out.println("Got BoneCPDataSource : " + boneCPDataSource);

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
		String title = "Employee Information From Oracle Database";
		out.print("<html><body bgcolor=\"#f0f0f0\">");
		out.print("<h1 align=\"center\">" + title + "</h1>\n");

		showEmployeeInformation(out);

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

	private void showEmployeeInformation( PrintWriter out )
	{
		Connection connection = null;
		Statement stmt = null;
		try
		{

			/*
			 * Get connection from the DataSource
			 */

			connection = boneCPDataSource.getConnection();

			/*
			 * Execute the Query
			 */

			stmt = connection.createStatement();
			String sql = "select employee_id,first_name,last_name,email,phone_number from employees";
			ResultSet rs = stmt.executeQuery(sql);

			/*
			 * Iterate the ResultSet and get each row Information.
			 */
			while( rs.next() )
			{
				/*
				 * Retrieve by column name
				 */
				int id = rs.getInt("employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");

				/*
				 * Display values
				 */
				out.print("employee_id: " + id + "<br>");
				out.print("first_name: " + firstName + "<br>");
				out.print("last_name: " + lastName + "<br>");
				out.print("email: " + email + "<br>");
				out.println("phone_number: " + phoneNumber + "<br>");
				out.println("-------------------------------------------"
				        + "<br>");
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
				if( stmt != null )
				{
					stmt.close();
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