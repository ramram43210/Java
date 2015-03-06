import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbcpBasicDataSource
{

	public static DataSource getDbcpBasicDataSource()
	{

		BasicDataSource basicDataSource = new BasicDataSource();
		try
		{
			basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			basicDataSource.setUsername("hr");
			basicDataSource.setPassword("hr");
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		return basicDataSource;
	}

	
}