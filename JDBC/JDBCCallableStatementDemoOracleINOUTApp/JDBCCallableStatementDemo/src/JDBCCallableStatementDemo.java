import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCCallableStatementDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Database credentials
	static final String USERNAME = "hr";
	static final String PASSWORD = "hr";

	public static void main(String[] args)
	{
		JDBCCallableStatementDemo jdbcCallableStatementDemo = new JDBCCallableStatementDemo();

		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.print("Enter the CountryId :");
			String countryId = scanner.nextLine();

			if (countryId.equals("exit"))
			{
				break;
			}

			jdbcCallableStatementDemo.getCountryName(countryId);

		}
		scanner.close();
	}

	private void getCountryName(String countryId)
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

			String plSql = "{call GET_COUNTRY_NAME(?,?)}";

			callableStatement = connection.prepareCall(plSql);

			/*
			 * Bind IN parameter first, then bind OUT parameters
			 */

			callableStatement.setString(1, countryId);

			/*
			 * Register OUT Parameters
			 */
			callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);

			/*
			 * Use execute method to run the stored procedure.
			 */

			callableStatement.execute();

			/*
			 * Retrieve countryName with getXXX method
			 */
			String countryName = callableStatement.getString(2);

			System.out.println("countryName : " + countryName);

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
