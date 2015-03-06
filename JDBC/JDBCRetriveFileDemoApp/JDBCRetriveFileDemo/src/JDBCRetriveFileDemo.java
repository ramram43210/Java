import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCRetriveFileDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{
		JDBCRetriveFileDemo jdbcRetriveFileDemo = new JDBCRetriveFileDemo();
		jdbcRetriveFileDemo.retriveFile();
	}

	private void retriveFile()
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

			String sql = "select * from CITY_HISTORY";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();

			while( rs.next() )
			{
				String name = rs.getString(2);
				Clob cityHistoryClob = rs.getClob(3);
				Reader reader = cityHistoryClob.getCharacterStream();

				FileWriter fw = new FileWriter("D:/Downloads/" + name );

				int i;
				while( (i = reader.read()) != -1 )
				{
					fw.write((char) i);
				}
				System.out.println("D:/Downloads/" + name +" has saved");
				fw.close();
			}

			rs.close();

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
				if( preparedStatement != null )
				{
					preparedStatement.close();
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
