import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME        = "root";
	static final String PASSWORD        = "root";

	public static void main( String[] args )
	{

		JDBCDemo jdbcDemo = new JDBCDemo();
		jdbcDemo.getCityInformation();

	}

	private void getCityInformation()
	{
		Connection connection = null;
		Statement stmt = null;
		try
		{
			/*
			 * STEP 1: Register JDBC driver
			 */
			Class.forName("com.mysql.jdbc.Driver");

			/*
			 * STEP 2: Open a connection
			 */
			System.out.println("Connecting to database...");
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

			/*
			 * STEP 3: Execute a query
			 */
			System.out.println("Creating statement...");
			
			System.out.println("-----------------------------------------------------");
			
			stmt = connection.createStatement();
			String sql = "select ID,Name,CountryCode,District,Population from city";
			ResultSet rs = stmt.executeQuery(sql);

			/*
			 * STEP 4: Extract data from result set
			 */
			while( rs.next() )
			{
				/*
				 * Retrieve by column name
				 */
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
			/*
			 * STEP 5: close resources
			 */
			rs.close();
			stmt.close();
			connection.close();
		}
		catch( SQLException se )
		{
			/*
			 * Handle errors for JDBC
			 */
			se.printStackTrace();
		}
		catch( ClassNotFoundException e )
        {
	        /*
	         *  Handle errors for Class.forName
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
				if( stmt != null )
				{
					stmt.close();
				}
			}
			catch( SQLException sqlException )
			{
				sqlException.printStackTrace();
			}
			try
			{
				if( connection != null )
				{
					connection.close();
				}
			}
			catch( SQLException sqlException )
			{
				sqlException.printStackTrace();
			}
		}

	}

}
