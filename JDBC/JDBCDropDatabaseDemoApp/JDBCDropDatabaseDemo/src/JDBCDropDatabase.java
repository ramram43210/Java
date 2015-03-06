import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDropDatabase
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{

		JDBCDropDatabase jdbcDropDatabase = new JDBCDropDatabase();
		jdbcDropDatabase.dropDatabase();

	}

	private void dropDatabase()
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
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

			String sql = "DROP DATABASE STUDENTS";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);
						
			int returnValue = preparedStatement.executeUpdate();

			System.out.println("returnValue : " + returnValue);
			
			System.out.println("STUDENTS database has been Droped");

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
