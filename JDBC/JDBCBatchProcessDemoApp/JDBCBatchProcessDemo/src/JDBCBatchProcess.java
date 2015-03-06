import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatchProcess
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{
		JDBCBatchProcess JDBCBatchProcess = new JDBCBatchProcess();
		JDBCBatchProcess.addCityInformation();
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

			String sql1 = "insert into city values(5000,'Bangalore','IND','Karnataka',400000)";
			String sql2 = "insert into city values(5001,'Channai','IND','TamilNadu',200000)";
			String sql3 = "insert into city values(5002,'Thiruvanathapuram','IND','Kerala',800000)";

			/*
			 * Execute the query
			 */
			statement = connection.createStatement();

			/*
			 * Add sql's to the batch
			 */
			statement.addBatch(sql1);
			statement.addBatch(sql2);
			statement.addBatch(sql3);

			int result[] = statement.executeBatch();

			/*
			 * Explicitly commit statements to apply changes
			 */
			connection.commit();

			for (int i = 0; i < result.length; i++)
			{
				System.out.println(result[i]);
			}

		}
		catch (SQLException se)
		{
			/*
			 * Handle errors for JDBC
			 */
			try
			{
				connection.rollback();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			se.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			/*
			 * Handle errors for Class.forName
			 */
			e.printStackTrace();
		}
		catch (Exception e)
		{
			try
			{
				connection.rollback();
			}
			catch (SQLException e1)
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
				if (statement != null)
				{
					statement.close();
				}
			}
			catch (SQLException sqlException)
			{
				sqlException.printStackTrace();
			}
			try
			{
				if (connection != null)
				{
					connection.close();
				}
			}
			catch (SQLException sqlException)
			{
				sqlException.printStackTrace();
			}
		}

	}
}
