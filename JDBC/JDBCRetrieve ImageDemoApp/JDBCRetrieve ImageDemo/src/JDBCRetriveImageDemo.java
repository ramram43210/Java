import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCRetriveImageDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{
		JDBCRetriveImageDemo jdbcRetriveImageDemo = new JDBCRetriveImageDemo();
		jdbcRetriveImageDemo.retriveImage();
	}

	private void retriveImage()
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

			String sql = "select * from CITY_IMAGE";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next())
			{
				String imageName = rs.getString(2);
				Blob imageBlob = rs.getBlob(3);
				FileOutputStream fileOutputStream = new FileOutputStream(
						"D:/Downloads/" + imageName);

				fileOutputStream.write(imageBlob.getBytes(1,
						(int) imageBlob.length()));
				
				System.out.println(imageName + " has been stored in D:/Downloads/" );
				
				fileOutputStream.close();
			}

			rs.close();

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
				if (preparedStatement != null)
				{
					preparedStatement.close();
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
