import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCreateTable
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{

		JDBCCreateTable jdbcCreateTable = new JDBCCreateTable();
		jdbcCreateTable.createTable();

	}

	private void createTable()
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

			String sql = "CREATE TABLE REGISTRATION " + "(id INT not NULL, "
			        + " first VARCHAR(255), " + " last VARCHAR(255), "
			        + " age INT, " + " PRIMARY KEY ( id ))";

			System.out.println(sql);

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);

			int returnValue = preparedStatement.executeUpdate();

			System.out.println("returnValue : " + returnValue);

			System.out.println("Table REGISTRATION has been created");

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
