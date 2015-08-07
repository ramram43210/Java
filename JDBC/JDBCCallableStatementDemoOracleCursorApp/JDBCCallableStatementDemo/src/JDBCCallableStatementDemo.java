import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class JDBCCallableStatementDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Database credentials
	static final String USERNAME = "hr";
	static final String PASSWORD = "hr";

	public static void main(String[] args)
	{
		JDBCCallableStatementDemo jdbcCallableStatementDemo = new JDBCCallableStatementDemo();
		jdbcCallableStatementDemo.getAllCountryInformation();
	}

	private void getAllCountryInformation()
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

			String plSql = "{call GET_ALL_COUNTRIES(?)}";

			callableStatement = connection.prepareCall(plSql);
			
			callableStatement.registerOutParameter(1,  OracleTypes.CURSOR);

			/*
			 * Use execute method to run the stored procedure.
			 */

			callableStatement.executeQuery();

			ResultSet rs=(ResultSet)callableStatement.getObject(1);
			
			while(rs.next())
			{
				System.out.print("COUNTRY_ID : "+rs.getString(1));
				System.out.print(", COUNTRY_NAME : "+rs.getString(2));
				System.out.println(", REGION_ID : "+rs.getString(3));
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
