import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadJDBCDriver
{
	private Connection connection = null;

	public static void main( String[] args )
	{
		try
		{
			LoadJDBCDriver loadJDBCDriver = new LoadJDBCDriver();
			loadJDBCDriver.loadDriver();
		}
		catch( ClassNotFoundException | SQLException e )
		{
			e.printStackTrace();
		}

	}

	private void loadDriver() throws ClassNotFoundException, SQLException
	{
		/*
		 * This will load the MySQL driver and Register the Driver in DriverManager, each DB has its own driver
		 */

		Class.forName("com.mysql.jdbc.Driver");

		/*
		 * Setup the connection with the DB.
		 */

		connection = DriverManager.getConnection(
		        "jdbc:mysql://localhost:3306/world", "root", "root");

		System.out.println("Connection Object :  " + connection);
	}

}
