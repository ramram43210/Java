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
		jdbcDataSourceDemo.getEmployeeInformation();

	}

	private void getEmployeeInformation()
	{
		Connection connection = null;
		Statement stmt = null;
		/*
		 * Get the OracleDataSource
		 */
		DataSource dataSource = OracleDataSource.getOracleDataSource();
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
			String sql = "select employee_id,first_name,last_name,email,phone_number from employees";
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
				int id = rs.getInt("employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");

				/*
				 * Display values
				 */
				System.out.print("employee_id: " + id);
				System.out.print(", first_name: " + firstName);
				System.out.print(", last_name: " + lastName);
				System.out.print(", email: " + email);
				System.out.println(", phone_number: " + phoneNumber);
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
