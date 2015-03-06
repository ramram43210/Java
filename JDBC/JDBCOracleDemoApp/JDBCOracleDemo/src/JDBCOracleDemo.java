import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOracleDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Database credentials
	static final String USERNAME = "hr";
	static final String PASSWORD = "hr";

	public static void main(String[] args)
	{

		JDBCOracleDemo jdbcOracleDemo = new JDBCOracleDemo();
		jdbcOracleDemo.getEmployEEInformation();

	}

	private void getEmployEEInformation()
	{
		Connection connection = null;
		Statement stmt = null;
		try
		{
			/*
			 * STEP 1: Register JDBC driver
			 */
			Class.forName(JDBC_DRIVER);

			/*
			 * STEP 2: Open a connection
			 */
			System.out.println("Connecting to database...");
			connection = DriverManager
					.getConnection(DB_URL, USERNAME, PASSWORD);

			/*
			 * STEP 3: Execute a query
			 */
			System.out.println("Creating statement...");

			System.out
					.println("-----------------------------------------------------");

			stmt = connection.createStatement();
			String sql = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER from EMPLOYEES";
			ResultSet rs = stmt.executeQuery(sql);

			/*
			 * STEP 4: Extract data from result set
			 */
			while (rs.next())
			{
				/*
				 * Retrieve by column name
				 */
				int id = rs.getInt("EMPLOYEE_ID");
				String firstName = rs.getString("FIRST_NAME");
				String lastName = rs.getString("LAST_NAME");
				String email = rs.getString("EMAIL");
				String phoneNumber = rs.getString("PHONE_NUMBER");

				/*
				 * Display values
				 */
				System.out.print("ID: " + id);
				System.out.print(", FirstName: " + firstName);
				System.out.print(", LastName: " + lastName);
				System.out.print(", Email: " + email);
				System.out.println(", PhoneNumber: " + phoneNumber);
			}
			/*
			 * STEP 5: close resources
			 */
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
				if (stmt != null)
				{
					stmt.close();
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
