import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MyqlDataSource
{

	public static DataSource getMySQLDataSource()
	{

		MysqlDataSource mysqlDS = null;
		try
		{
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL("jdbc:mysql://localhost:3306/world");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("root");
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}

		return mysqlDS;
	}

}