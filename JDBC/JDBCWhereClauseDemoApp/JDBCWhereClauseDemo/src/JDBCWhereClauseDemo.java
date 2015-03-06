import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCWhereClauseDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{

		JDBCWhereClauseDemo jdbcWhereClauseDemo = new JDBCWhereClauseDemo();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter countryCodeValue :");
		while (scanner.hasNext())
		{
			String countryCodeValue = scanner.nextLine();
			if (countryCodeValue.equalsIgnoreCase("Exit"))
			{
				break;
			}
			jdbcWhereClauseDemo.getCityInformation(countryCodeValue);
			System.out.print("\nEnter countryCodeValue :");
		}

		scanner.close();

	}

	/*
	 * Get City Information based on Country Code
	 */

	private void getCityInformation(String countryCodeValue)
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

			String sql = "select * from city where countrycode=?";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, countryCodeValue);

			ResultSet rs = preparedStatement.executeQuery();

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
