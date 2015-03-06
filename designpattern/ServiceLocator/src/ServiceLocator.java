public class ServiceLocator
{
		private static Cache cache;

		static
		{
				cache = new Cache();
		}

		public static Service getService( String jndiName )
		{
				// First check the service object available in cache
				Service service = cache.getService(jndiName);

				if( service != null )
				{
						return service;
				}

				/*
				 * If service object not available in cache do the lookup using
				 * JNDI initial context and get the service object and add it to
				 * the cache for future use
				 */
				InitialContext context = new InitialContext();
				Service service1 = (Service) context.lookup(jndiName);
				cache.addService(service1);
				return service1;
		}
}
