import com.jolbox.bonecp.BoneCPDataSource;

public class ConnectionManager
{

	private static BoneCPDataSource boneCPDataSource = null;

	public static BoneCPDataSource getBoneCPDataSource()
	{
		return boneCPDataSource;
	}

	public static void setBoneCPDataSource( BoneCPDataSource boneCPDataSource )
	{
		ConnectionManager.boneCPDataSource = boneCPDataSource;
	}

	public static BoneCPDataSource configureBoneCPDataSource()
	{
		try
		{
			/*
			 * load the database driver (make sure this is in your classpath!)
			 */
			Class.forName("com.mysql.jdbc.Driver");

			/*
			 * setup the BoneCPDataSource
			 */

			BoneCPDataSource boneCPDataSource = new BoneCPDataSource();

			boneCPDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/world");
			boneCPDataSource.setUsername("root");
			boneCPDataSource.setPassword("root");
			boneCPDataSource.setMinConnectionsPerPartition(5);
			boneCPDataSource.setMaxConnectionsPerPartition(10);
			boneCPDataSource.setPartitionCount(1);

			setBoneCPDataSource(boneCPDataSource);

			System.out
			        .println("contextInitialized.....boneCPDataSource is configured");

		}
		catch( Exception exe )
		{
			exe.printStackTrace();
		}

		return boneCPDataSource;
	}

	public static void closeBoneCPDataSource()
	{

		try
		{
			BoneCPDataSource boneCPDataSource = ConnectionManager
			        .getBoneCPDataSource();
			
			if( boneCPDataSource != null )
			{
				/*
				 * This method must be called only once when the application
				 * stops.
				 */

				boneCPDataSource.close();
				System.out
				        .println("contextDestroyed.....boneCPDataSource is closed!");
			}

		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}

}
