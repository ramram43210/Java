public class ChainOfResDemo
{

		public static void main( String[] args )
		{
				ATM atm = new ATM();
				
				System.out.println("\n ----------------Requested Amount 475-----------------------\n");
				
				atm.withdraw(475);
				
				
				System.out.println("\n ----------------Requested Amount 455-----------------------\n");
				
				atm.withdraw(455);
				
							
				System.out.println("\n ----------------Requested Amount 520-----------------------\n");
				
				atm.withdraw(520);	
				
				
		}

}
