import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUpdatableResultSetDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{

		JDBCUpdatableResultSetDemo jdbcUpdatableResultSetDemo = 
				                                 new JDBCUpdatableResultSetDemo();
		jdbcUpdatableResultSetDemo.updateOrInsertCityInformation();

	}

	private void updateOrInsertCityInformation()
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

			String sql = "select * from city limit ?";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			preparedStatement.setInt(1, 10);

			ResultSet rs = preparedStatement.executeQuery();

			/*
			 * Moves the cursor to the fifth row of rs and update the column
			 * information
			 */

			rs.absolute(5);
			rs.updateInt("Population", 50000);
			rs.updateRow();
			System.out.println("5th row population column is updated");

			/*
			 * Moves cursor to the insert row
			 */

			rs.moveToInsertRow();
			rs.updateInt(1, 4080);
			rs.updateString(2, "Chennai");
			rs.updateString(3, "IND");
			rs.updateString(4, "TamilNadu");
			rs.updateInt(5, 200000);
			rs.insertRow();

			System.out.println("4080th row has been inserted in city table");

			rs.close();

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
