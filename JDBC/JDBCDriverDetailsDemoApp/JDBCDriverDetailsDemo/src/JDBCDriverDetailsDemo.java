import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriverDetailsDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{

		JDBCDriverDetailsDemo jdbcDriverDetailsDemo = new JDBCDriverDetailsDemo();
		jdbcDriverDetailsDemo.getCityInformation();

	}

	private void getCityInformation()
	{
		Connection connection = null;
		Statement stmt = null;
		try
		{
			/*
			 * Register the JDBC driver in DriverManager
			 */

			Class.forName(JDBC_DRIVER);

			/*
			 * Establish connection to the Database using DriverManager
			 */

			connection = DriverManager
			        .getConnection(DB_URL, USERNAME, PASSWORD);

			System.out.println("Connection Object : "
			        + connection.getClass().getName());

			stmt = connection.createStatement();

			System.out.println("Statement Object : "
			        + stmt.getClass().getName());

			String sql = "select ID,Name,CountryCode,District,Population from city";

			/*
			 * Execute a query
			 */

			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("ResultSet Object : " + rs.getClass().getName());

			rs.close();
			stmt.close();
			connection.close();
		}
		catch( SQLException se )
		{
			/*
			 * Handle errors for JDBC
			 */
			se.printStackTrace();
		}
		catch( ClassNotFoundException e )
		{
			/*
			 * Handle errors for Class.forName
			 */
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
