public class OuterClass
{

	private String name = "John";

	public void display(String param)
	{

		String localVar ="Local Variable";
		
		class LocalClass
		{
			String message = "Welcome";

			public void displayMessage()
			{
				System.out.println("message = " + message + " " + name);
				
				System.out.println("localVar = " +localVar);
				
				//localVar = "Change";
				//param ="hi";
				
				System.out.println("param = " +param);
				
			}

		}

		LocalClass localClass = new LocalClass();
		localClass.displayMessage();
	}
}
