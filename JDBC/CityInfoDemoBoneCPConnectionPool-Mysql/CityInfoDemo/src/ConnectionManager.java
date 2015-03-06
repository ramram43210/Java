import com.jolbox.bonecp.BoneCPConfig;

public class ConnectionManager
{

	private static com.jolbox.bonecp.BoneCP boneCPConnectionPool = null;

	public static com.jolbox.bonecp.BoneCP getConnectionPool()
	{
		return boneCPConnectionPool;
	}

	public static void setConnectionPool(com.jolbox.bonecp.BoneCP connectionPool)
	{
		ConnectionManager.boneCPConnectionPool = connectionPool;
	}

	public static void configureBoneCPConnectionPool()
	{
		try
		{
			/*
			 * load the database driver (make sure this is in your classpath!)
			 */
			Class.forName("com.mysql.jdbc.Driver");

			/*
			 * setup the connection pool
			 */

			BoneCPConfig boneCPConfig = new BoneCPConfig();
			boneCPConfig.setJdbcUrl("jdbc:mysql://localhost:3306/world");
			boneCPConfig.setUsername("root");
			boneCPConfig.setPassword("root");
			boneCPConfig.setMinConnectionsPerPartition(5);
			boneCPConfig.setMaxConnectionsPerPartition(10);
			boneCPConfig.setPartitionCount(1);
			boneCPConnectionPool = new com.jolbox.bonecp.BoneCP(boneCPConfig);

			setConnectionPool(boneCPConnectionPool);

			System.out
					.println("contextInitialized.....Connection Pooling is configured");

		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}

	}

	public static void shutdownBoneCPConnectionPool()
	{

		try
		{
			com.jolbox.bonecp.BoneCP connectionPool = ConnectionManager
					.getConnectionPool();
			if (connectionPool != null)
			{
				/*
				 * This method must be called only once when the application
				 * stops. you don't need to call it every time when you get a
				 * connection from the Connection Pool
				 */

				connectionPool.shutdown();
				System.out
						.println("contextDestroyed.....Connection Pooling shut downed!");
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
