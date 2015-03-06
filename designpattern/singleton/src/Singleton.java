public class Singleton
{
		// Static member holds only one instance of the Singleton class
		private static Singleton singletonInstance;

		// SingletonExample prevents any other class from instantiating
		private Singleton()
		{
				
		}

		// Providing Global point of access
		public static Singleton getSingletonInstance()
		{
				if( null == singletonInstance )
				{
						singletonInstance = new Singleton();
						System.out.println("Inside null check , Object is Created : " +singletonInstance.toString());
						System.out.println(" ----------------------------------------------------- ");
				}
				return singletonInstance;
		}

		public void printSingleton()
		{
				System.out.println("Inside print Singleton object : " +singletonInstance.toString());
				System.out.println("");
		}

}
