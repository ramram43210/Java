import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCreateDatabase
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{

		JDBCCreateDatabase jdbcCreateDatabase = new JDBCCreateDatabase();
		jdbcCreateDatabase.createDatabase();

	}

	private void createDatabase()
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

			String sql = "CREATE DATABASE STUDENTS";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);

			int returnValue = preparedStatement.executeUpdate();

			System.out.println("returnValue : " + returnValue);

		}
		catch (SQLException se)
		{
			/*
			 * Handle errors for JDBC
			 */
			se.printStackTrace();
		}
		catch (ClassNotFoundException e)
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
				if (preparedStatement != null)
				{
					preparedStatement.close();
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
