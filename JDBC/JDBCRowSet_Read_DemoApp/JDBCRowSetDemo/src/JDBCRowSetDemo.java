import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{
		JDBCRowSetDemo jdbcRowSetDemo = new JDBCRowSetDemo();
		Scanner scanner = new Scanner(System.in);
		while( true )
		{
			System.out.print("Enter City Country Code :");
			String cityCountrycode = scanner.nextLine();

			if( cityCountrycode.equals("exit") )
			{
				break;
			}

			jdbcRowSetDemo.getCityInformation(cityCountrycode);

		}
		scanner.close();
	}

	private void getCityInformation( String cityCountrycode )
	{
		JdbcRowSet jdbcRowSet = null;
		try
		{
			/*
			 * Using RowSetFactory create the JdbcRowSet object.
			 */
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			jdbcRowSet = rowSetFactory.createJdbcRowSet();

			/*
			 * Set the JdbcRowSet properties [URL,username,password,command]
			 */
			jdbcRowSet.setUrl(DB_URL);
			jdbcRowSet.setUsername(USERNAME);
			jdbcRowSet.setPassword(PASSWORD);

			/*
			 * Sets the command property with a query that produces a ResultSet
			 * object containing all the data in the table
			 */

			jdbcRowSet.setCommand("select * from city where countrycode=?");
			jdbcRowSet.setString(1, cityCountrycode);

			/*
			 * The execute method does many things for you in the background:
			 * 
			 *  1.It makes a connection to the database using the values you assigned to the url,
			 *    username, and password properties.
			 *    
			 *  2.It executes the query you set in the command property.
			 *  
			 *  3.It reads the data from the resulting ResultSet object into the jdbcRs object.
			 *  
			 */			
			jdbcRowSet.execute();

			/*
			 *  Iterate the jdbcRowSet and get each row information
			 *  of city table.
			 */
			
			while( jdbcRowSet.next() )
			{
				int id = jdbcRowSet.getInt(1);
				String name = jdbcRowSet.getString(2);
				String countryCode = jdbcRowSet.getString(3);
				String district = jdbcRowSet.getString(4);
				int population = jdbcRowSet.getInt(5);

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
			if(jdbcRowSet!=null)
			{
				try
                {
	                jdbcRowSet.close();
                }
                catch( SQLException e )
                {
	                e.printStackTrace();
                }
			}
		}

	}
}
