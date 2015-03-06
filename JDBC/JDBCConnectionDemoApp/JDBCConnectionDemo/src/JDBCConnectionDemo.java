import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class JDBCConnectionDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{

		JDBCConnectionDemo jdbcConnectionDemo = new JDBCConnectionDemo();
		jdbcConnectionDemo.getConnection();

	}

	private void getConnection()
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
			
			stmt = connection.createStatement();
			
			System.out.println("Statement Object : "+ stmt);
			
			DatabaseMetaData dbmd=connection.getMetaData();
			
			System.out.println("DatabaseMetaData Object : "+ dbmd);
			
			String sql = "select ID,Name,CountryCode,District,Population from city";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			System.out.println("preparedStatement Object : "+ preparedStatement);

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
