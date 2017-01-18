public class AnnonymousShutdownHook
{

	public static void main(String[] args)
	{
		Runtime runtime = Runtime.getRuntime();

		runtime.addShutdownHook(new Thread()
		{
			public void run()
			{
				System.out.println("Shut down hook task is completed..");
			}
		});

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
