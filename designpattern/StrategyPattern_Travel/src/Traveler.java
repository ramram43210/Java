import java.util.Scanner;

public class Traveler
{

		public static void main( String[] args )
		{

				System.out.println("Please enter Travel Type : 'Bus' or 'Train' or 'Taxi' or 'Auto' ");
				Scanner scanner = new Scanner(System.in);
				String travelType = scanner.next();
				System.out.println("Travel type is : " + travelType);

				TravelContext ctx = null;
				ctx = new TravelContext();

				if( "Bus".equalsIgnoreCase(travelType) )
				{
						ctx.setTravelStrategy(new BusTravelStrategy());
				}
				else if("Train".equalsIgnoreCase(travelType))
				{
						ctx.setTravelStrategy(new TrainTravelStrategy());
				}
				else if("Taxi".equalsIgnoreCase(travelType))
				{
						ctx.setTravelStrategy(new TaxiTravelStrategy());
				}
				else if("Auto".equalsIgnoreCase(travelType))
				{
						ctx.setTravelStrategy(new AutoTravelStrategy());
				}
				System.out.println("Travel context has : "+ctx.getTravelStrategy());
				ctx.gotoAirport();

		}
}