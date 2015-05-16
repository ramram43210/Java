import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
			System.out.print("Enter City Country Code :");
			String cityCountrycode = scanner.nextLine();

			if (cityCountrycode.equals("exit"))
			{
				break;
			}

			jdbcCallableStatementDemo.getCitiesInfo(cityCountrycode);

		}
		scanner.close();
	}

	private void getCitiesInfo(String cityCountrycode)
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

			String plSql = "{call getCitiesBasedOnCountryCode(?)}";

			/*
			 * Creates a CallableStatement object for calling database stored
			 * procedures. The CallableStatement object provides methods for
			 * setting up its IN and OUT parameters, and methods for executing
			 * the call to a stored procedure.
			 */

			callableStatement = connection.prepareCall(plSql);

			/*
			 * Bind IN parameter first, then bind OUT parameters
			 */

			callableStatement.setString(1, cityCountrycode);

			/*
			 * Use execute method to run the stored procedure.
			 */
			ResultSet rs = callableStatement.executeQuery();

			while (rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);

				/*
				 * Display values
				 */
				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print(", CountryCode: " + countryCode);
				System.out.print(", District: " + district);
				System.out.println(", Population: " + population);
			}

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
