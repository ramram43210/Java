import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCCallableStatementDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{
		JDBCCallableStatementDemo jdbcCallableStatementDemo = new JDBCCallableStatementDemo();

		Scanner scanner = new Scanner(System.in);
		while( true )
		{
			System.out.print("Enter City Id :");
			int cityId = scanner.nextInt();
			System.out.print("Enter City population :");
			int population = scanner.nextInt();

			if( cityId == 0 && population == 0)
			{
				break;
			}

			jdbcCallableStatementDemo.getCityInfo(cityId,population);

		}
		scanner.close();
	}

	private void getCityInfo( int cityId , int population )
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

			String plSql = "{call getCityInfo (?,?,?,?,?,?)}";

			callableStatement = connection.prepareCall(plSql);

			/*
			 * Bind IN parameter first, then bind OUT parameters
			 */

			callableStatement.setInt(1, cityId);
			callableStatement.setInt(2, population);

			/*			 
			 * Register OUT Parameters			  
			 */
			callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(4, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(5, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(6, java.sql.Types.INTEGER);

			/*
			 * Use execute method to run the stored procedure.
			 */
			callableStatement.execute();

			/*
			 * Retrieve cityName,countryCode,district and cityPopulation with getXXX method
			 */
			String cityName = callableStatement.getString(3);
			String countryCode = callableStatement.getString(4);
			String district = callableStatement.getString(5);
			int cityPopulation = callableStatement.getInt(6);

			System.out.println("city Name : " + cityName+", countryCode : " +countryCode 
					+", district : "+district+", population : "+cityPopulation);

		}
		catch( SQLException se )
		{
			se.printStackTrace();
		}
		catch( ClassNotFoundException e )
		{
			e.printStackTrace();
		}
		catch( Exception e )
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
				if( callableStatement != null )
				{
					callableStatement.close();
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
