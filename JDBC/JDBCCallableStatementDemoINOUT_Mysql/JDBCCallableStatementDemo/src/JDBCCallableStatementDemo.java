import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCCallableStatementDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{
		JDBCCallableStatementDemo jdbcCallableStatementDemo = new JDBCCallableStatementDemo();

		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.print("Enter City Id :");
			int cityId = scanner.nextInt();

			if (cityId == 0)
			{
				break;
			}

			jdbcCallableStatementDemo.getCityName(cityId);

		}
		scanner.close();
	}

	private void getCityName(int cityId)
	{
		Connection connection = null;
		CallableStatement callableStatement = null;
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

			String plSql = "{call getCityName (?, ?)}";

			/*
			 * Creates a CallableStatement object for calling database stored
			 * procedures. The CallableStatement object provides methods for
			 * setting up its IN and OUT parameters, and methods for executing
			 * the call to a stored procedure.
			 */

			callableStatement = connection.prepareCall(plSql);

			/*
			 * Bind IN parameter first, then bind OUT parameter
			 */

			callableStatement.setInt(1, cityId);

			/*
			 * Second parameter is OUT so register it
			 */
			callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);

			/*
			 * Use execute method to run stored procedure.
			 */
			callableStatement.execute();

			/*
			 * Retrieve cityName with getXXX method
			 */
			String cityName = callableStatement.getString(2);

			System.out.println("city Name : " + cityName);

		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
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
				if (callableStatement != null)
				{
					callableStatement.close();
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
