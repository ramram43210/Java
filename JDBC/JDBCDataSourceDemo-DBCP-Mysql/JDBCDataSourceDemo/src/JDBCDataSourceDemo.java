import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class JDBCDataSourceDemo
{

	public static void main( String[] args )
	{
		JDBCDataSourceDemo jdbcDataSourceDemo = new JDBCDataSourceDemo();
		jdbcDataSourceDemo.getCityInformation();

	}

	private void getCityInformation()
	{
		Connection connection = null;
		Statement stmt = null;
		/*
		 * Get the dbcp2 BasicDataSource
		 */
		DataSource dataSource = DbcpBasicDataSource.getDbcpBasicDataSource();
		try
		{
			/*
			 *  Get connection from the DataSource
			 */
			connection = dataSource.getConnection();
			
			/*
			 *  Execute the Query
			 */
			
			stmt = connection.createStatement();
			String sql = "select ID,Name,CountryCode,District,Population from city";
			ResultSet rs = stmt.executeQuery(sql);

			/*
			 *  Iterate the ResultSet and get each row
			 *  Information.
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
			rs.close();		
		}
		catch( SQLException se )
		{
			se.printStackTrace();
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
