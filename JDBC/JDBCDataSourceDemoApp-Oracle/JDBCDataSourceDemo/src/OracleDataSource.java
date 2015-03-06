import javax.sql.DataSource;

public class OracleDataSource
{

	public static DataSource getOracleDataSource()
	{

		oracle.jdbc.pool.OracleDataSource oracleDS = null;
		try
		{
			oracleDS = new oracle.jdbc.pool.OracleDataSource();
			oracleDS.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			oracleDS.setUser("hr");
			oracleDS.setPassword("hr");
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}

		return oracleDS;
	}

}