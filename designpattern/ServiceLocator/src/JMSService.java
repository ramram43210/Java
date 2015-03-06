public class JMSService implements Service
{

		@Override
		public void execute()
		{
				System.out.println("Executing JMSService");

		}
		
		@Override
		public String getName()
		{
				return "JMSService";
		}

}
