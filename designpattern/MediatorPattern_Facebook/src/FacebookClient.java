public class FacebookClient
{

		public static void main( String[] args )
		{
				FacebookGroupMediator facebookMediator = new FacebookGroupMediatorImpl();
				User dave = new UserImpl(facebookMediator, "Dave");
				User ram = new UserImpl(facebookMediator, "Ram");
				User raj = new UserImpl(facebookMediator, "Raj");
				User anu = new UserImpl(facebookMediator, "Anu");
				User rahul = new UserImpl(facebookMediator, "Rahul");
				User steve = new UserImpl(facebookMediator, "Steve");
				User raju = new UserImpl(facebookMediator, "Raju");

								
				facebookMediator.registerUser(dave);
				facebookMediator.registerUser(ram);
				facebookMediator.registerUser(raj);
				facebookMediator.registerUser(anu);
				facebookMediator.registerUser(rahul);
				facebookMediator.registerUser(steve);
				facebookMediator.registerUser(raju);
				
				dave.send("ramj2ee.blogspot.com - this blog is very good blog ");
				
				System.out.println("##############################################################################");
				
				ram.send("what is Design Patterns? Please explain ");

		}

}