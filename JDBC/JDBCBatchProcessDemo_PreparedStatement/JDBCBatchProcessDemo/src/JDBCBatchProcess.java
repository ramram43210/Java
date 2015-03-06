import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBatchProcess
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL      = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME    = "root";
	static final String PASSWORD    = "root";

	public static void main( String[] args )
	{
		JDBCBatchProcess JDBCBatchProcess = new JDBCBatchProcess();
		JDBCBatchProcess.addCityInformation();
	}

	private void addCityInformation()
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

			/*
			 * Set auto-commit to false
			 */
			connection.setAutoCommit(false);

			String sql = "insert into city values(?,?,?,?,?)";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, 5000);
			preparedStatement.setString(2, "Bangalore");
			preparedStatement.setString(3, "IND");
			preparedStatement.setString(4, "Karnataka");
			preparedStatement.setInt(5, 20000);

			/*
			 * Add sql to the batch
			 */

			preparedStatement.addBatch();

			preparedStatement.setInt(1, 5001);
			preparedStatement.setString(2, "Channai");
			preparedStatement.setString(3, "IND");
			preparedStatement.setString(4, "TamilNadu");
			preparedStatement.setInt(5, 200000);

			/*
			 * Add sql to the batch
			 */

			preparedStatement.addBatch();

			preparedStatement.setInt(1, 5002);
			preparedStatement.setString(2, "Thiruvanathapuram");
			preparedStatement.setString(3, "IND");
			preparedStatement.setString(4, "Kerala");
			preparedStatement.setInt(5, 800000);

			/*
			 * Add sql to the batch
			 */

			preparedStatement.addBatch();

			int result[] = preparedStatement.executeBatch();

			/*
			 * Explicitly commit statements to apply changes
			 */
			connection.commit();

			for( int i = 0; i < result.length; i++ )
			{
				System.out.println(result[i]);
			}

		}
		catch( SQLException se )
		{
			/*
			 * Handle errors for JDBC
			 */
			try
			{
				connection.rollback();
			}
			catch( SQLException e )
			{
				e.printStackTrace();
			}
			se.printStackTrace();
		}
		catch( ClassNotFoundException e )
		{
			/*
			 * Handle errors for Class.forName
			 */
			e.printStackTrace();
		}
		catch( Exception e )
		{
			try
			{
				connection.rollback();
			}
			catch( SQLException e1 )
			{

				e1.printStackTrace();
			}
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
