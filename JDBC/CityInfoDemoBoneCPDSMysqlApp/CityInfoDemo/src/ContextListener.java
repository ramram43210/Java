import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener
{

	@Override
	public void contextInitialized( ServletContextEvent arg0 )
	{
		System.out.println("\n---------------------------------------------");
		System.out.println("ContextInitialized Method has been Called......");
		ConnectionManager.configureBoneCPDataSource();
		System.out.println("---------------------------------------------\n");

	}

	@Override
	public void contextDestroyed( ServletContextEvent arg0 )
	{
		System.out.println("\n---------------------------------------------");
		System.out.println("contextDestroyed Method has been Called......");
		ConnectionManager.closeBoneCPDataSource();
		System.out.println("---------------------------------------------\n");

	}

}
