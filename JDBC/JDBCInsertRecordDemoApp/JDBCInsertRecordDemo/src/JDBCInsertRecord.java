import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsertRecord
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{

		JDBCInsertRecord jdbcInsertRecord = new JDBCInsertRecord();
		jdbcInsertRecord.addCityInformation();

	}

	private void addCityInformation()
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

			String sql = "insert into city values  (?,?,?,?,?);";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 5000);
			preparedStatement.setString(2, "Bangalore");
			preparedStatement.setString(3, "IND");
			preparedStatement.setString(4, "Karnataka");
			preparedStatement.setInt(5, 20000);

			int numberOfRowsInerted = preparedStatement.executeUpdate();

			System.out.println("numberOfRowsInerted : " + numberOfRowsInerted);

			System.out.println("5000th row has been inserted in city table");

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

		catch (Exception e)
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
