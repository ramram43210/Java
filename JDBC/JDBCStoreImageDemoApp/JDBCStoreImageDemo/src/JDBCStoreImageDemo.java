import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCStoreImageDemo
{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	// Database credentials
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args)
	{
		JDBCStoreImageDemo jdbcStoreImageDemo = new JDBCStoreImageDemo();
		jdbcStoreImageDemo.storeImage();
	}

	private void storeImage()
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		FileInputStream fileInputStream = null;
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

			String sql = "insert into CITY_IMAGE values(?,?,?);";

			/*
			 * Execute the query
			 */
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, 1);
			
			File file= new File("D:/Downloads/New york.jpg");
			preparedStatement.setString(2, file.getName());
			
			fileInputStream = new FileInputStream(file);
			preparedStatement.setBinaryStream(3, fileInputStream,
					fileInputStream.available());

			int numberOfRowsInserted = preparedStatement.executeUpdate();

			System.out
					.println("numberOfRowsInserted : " + numberOfRowsInserted);

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

			if (preparedStatement != null)
			{
				try
				{
					preparedStatement.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			if (connection != null)
			{
				try
				{
					connection.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}

			if (fileInputStream != null)
			{
				try
				{
					fileInputStream.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
}
