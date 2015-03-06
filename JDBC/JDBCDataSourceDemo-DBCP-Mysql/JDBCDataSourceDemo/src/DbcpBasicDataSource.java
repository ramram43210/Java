import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbcpBasicDataSource
{

	public static DataSource getDbcpBasicDataSource()
	{

		BasicDataSource basicDataSource = new BasicDataSource();
		try
		{
			basicDataSource.setUrl("jdbc:mysql://localhost:3306/world");
			basicDataSource.setUsername("root");
			basicDataSource.setPassword("root");
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		return basicDataSource;
	}

	
}