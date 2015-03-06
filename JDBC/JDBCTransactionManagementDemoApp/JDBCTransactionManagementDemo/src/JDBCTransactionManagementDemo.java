import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransactionManagementDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{
		JDBCTransactionManagementDemo jdbcTransactionManagementDemo =
				                             new JDBCTransactionManagementDemo();
		jdbcTransactionManagementDemo.addCityInformation();
	}

	private void addCityInformation()
	{
		Connection connection = null;
		Statement statement = null;
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

			/*
			 * Set auto-commit to false
			 */
			connection.setAutoCommit(false);

			String sql1 = "insert into city values(6000,'Bangalore','IND','Karnataka',400000)";
			String sql2 = "insert into city values(6001,'Channai','IND','TamilNadu',200000)";
			String sql3 = "insert into city values(6002,'Thiruvanathapuram','IND','Kerala',800000)";

			/*
			 * Execute the query
			 */
			statement = connection.createStatement();

			/*
			 * Execute each sql one by one
			 */
			statement.executeUpdate(sql1);
			System.out.println(sql1 + " : Sql1 is Successfully executed");
			statement.executeUpdate(sql2);
			System.out.println(sql2 + ": Sql2 is Successfully executed");
			statement.executeUpdate(sql3);
			System.out.println(sql3 + ": Sql3 is Successfully executed");

			/*
			 * If there is no error
			 */
			connection.commit();

			System.out
			        .println("Changes are committed and applied to the Database");

		}
		catch( SQLException se )
		{
			/*
			 * Handle errors for JDBC
			 */
			try
			{
				/*
				 * If there is any error.
				 */
				connection.rollback();
				System.out
				        .println("Changes are rollbacked and not applied to the Database");
			}
			catch( SQLException e )
			{
				e.printStackTrace();
			}
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
			try
			{
				/*
				 * If there is any error.
				 */
				connection.rollback();
				System.out
				        .println("Changes are rollbacked and not applied to the Database");
			}
			catch( SQLException e1 )
			{

				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally
		{
			/*
			 * finally block used to close resources
			 */
			try
			{
				if( statement != null )
				{
					statement.close();
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
