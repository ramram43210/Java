import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCScrollableResultSetDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{

		JDBCScrollableResultSetDemo jdbcScrollableResultSetDemo =
		                                      new JDBCScrollableResultSetDemo();
		jdbcScrollableResultSetDemo.getCityInformation();

	}

	private void getCityInformation()
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
			preparedStatement = connection
					.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			preparedStatement.setInt(1, 10);

			ResultSet rs = preparedStatement.executeQuery();

			/*
			 * ResultSet Move Forward
			 */

			System.out
					.println("------------- ResultSet Move Forward -----------------");

			while (rs.next())
			{
				int id = rs.getInt("ID");
				String name = rs.getString("Name");
				String countryCode = rs.getString("CountryCode");
				String district = rs.getString("District");
				int population = rs.getInt("Population");

				/*
				 * Display values
				 */
				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print(", CountryCode: " + countryCode);
				System.out.print(", District: " + district);
				System.out.println(", Population: " + population);
			}

			System.out
					.println("\n------------- ResultSet Move Backward ----------------");

			/*
			 * Move the ResultSet cursor to the last row
			 */
			rs.last();

			while (rs.previous())
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

			System.out
					.println("\n----------- ResultSet Move to Particular position -------------");

			// Getting the record of 3rd row
			rs.absolute(3);
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
