/*
 * public void addShutdownHook(Thread hook)
 * 
 * Parameters: 
 * ----------- 
 * 
 * hook - An initialized but unstarted Thread object
 */
public class ShutdownHookDemo
{
	public static void main(String[] args)
	{
		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();
		/*
		 * Registers a new virtual-machine shutdown hook.
		 */
		runtime.addShutdownHook(new ShudownHookThread());

		System.out.println("Now main thread sleeping... press ctrl+c to exit");

		try
		{
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
