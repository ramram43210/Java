public class InitialContext
{
		public Object lookup( String jndiName )
		{
				if( jndiName.equalsIgnoreCase("EJBService") )
				{
						// JNDI lookup code will come in real time implementation
						System.out.println("Looking up and creating a new EJBService object");
						return new EJBService();
				}
				else if( jndiName.equalsIgnoreCase("JMSService") )
				{
					    // JNDI lookup code will come in real time implementation
						System.out.println("Looking up and creating a new JMSService object");
						return new JMSService();
				}
				return null;
		}
}
