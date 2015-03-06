public class MementoClient
{

		public static void main( String[] args )
		{
				Originator originator = new Originator();
				originator.setLedTV(new LedTV("42 inch", "60000Rs", false));

				Caretaker caretaker = new Caretaker();
				caretaker.addMemento(originator.createMemento());

				originator.setLedTV(new LedTV("46 inch", "80000Rs", true));
				caretaker.addMemento(originator.createMemento());

				originator.setLedTV(new LedTV("50 inch", "100000Rs", true));
				
				System.out.println("\nOrignator current state : " + originator);

				System.out.println("\nOriginator restoring to 42 inch LED TV...");

				originator.setMemento(caretaker.getMemento(0));

				System.out.println("\nOrignator current state : " + originator);

		}

}
