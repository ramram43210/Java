import java.sql.SQLException;

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
		jdbcRowSetDemo.addOrUpdateOrDeleteCityInformation();

	}

	private void addOrUpdateOrDeleteCityInformation()
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

			jdbcRowSet.setCommand("select * from city where countrycode='AFG'");
			
			/*
			 * The execute method does many things for you in the background:
			 * 
			 * 1.It makes a connection to the database using the values you
			 * assigned to the url, username, and password properties.
			 * 
			 * 2.It executes the query you set in the command property.
			 * 
			 * 3.It reads the data from the resulting ResultSet object into the
			 * jdbcRs object.
			 */
			jdbcRowSet.execute();

			/*
			 * Moves the cursor to the fifth row of rs and update the column
			 * information
			 */

			jdbcRowSet.absolute(3);
			jdbcRowSet.updateInt("Population", 100);
			jdbcRowSet.updateRow();
			System.out.println("3rd row population column is updated");

			/*
			 * Moves cursor to the insert row
			 */

			jdbcRowSet.moveToInsertRow();
			jdbcRowSet.updateInt(1, 5080);
			jdbcRowSet.updateString(2, "India");
			jdbcRowSet.updateString(3, "IND");
			jdbcRowSet.updateString(4, "TamilNadu");
			jdbcRowSet.updateInt(5, 200000);
			jdbcRowSet.insertRow();

			System.out.println("5080th row has been inserted into the city table");
			
			jdbcRowSet.absolute(1);
			jdbcRowSet.deleteRow();
			
			System.out.println("1st row has been deleted from the city table");		
			

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
			if( jdbcRowSet != null )
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
