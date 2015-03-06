import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCResultSetMetaDataDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{

		JDBCResultSetMetaDataDemo jdbcResultSetMetaDataDemo = new JDBCResultSetMetaDataDemo();
		jdbcResultSetMetaDataDemo.getCityMetadataInformation();

	}

	private void getCityMetadataInformation()
	{
		Connection connection = null;
		Statement stmt = null;
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

			stmt = connection.createStatement();
			String sql = "select ID,Name,CountryCode,District,Population from city";

			/*
			 * Execute a query
			 */

			ResultSet rs = stmt.executeQuery(sql);

			ResultSetMetaData rsmd = rs.getMetaData();

			int columnCount = rsmd.getColumnCount();
			System.out.println("Total number of columns : " + columnCount
					+ "\n");

			/*
			 * Get all column names,column type and columnDisplaySize from the
			 * ResultSetMetaData
			 */
			for (int i = 1; i <= columnCount; i++)
			{
				String columnName = rsmd.getColumnName(i);
				String columnType = rsmd.getColumnTypeName(i);
				int columnDisplaySize = rsmd.getColumnDisplaySize(i);
				System.out.println("ColumnName : " + columnName + ","
						+ "ColumnType : " + columnType + ","
						+ "ColumnDisplaySize : " + columnDisplaySize);
				System.out.println();
			}

			rs.close();
			stmt.close();
			connection.close();
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
