public class Client
{

		public static void main( String[] args )
		{
				BusinessDelegate businessDelegate = new BusinessDelegate();
				
				System.out.println("Invoke the business delegate by passing service type as EJB");
				
				businessDelegate.doTask("EJB");
				
				System.out.println("");
				
				System.out.println("Invoke the business delegate by passing service type as JMS");

				businessDelegate.doTask("JMS");

		}

}
