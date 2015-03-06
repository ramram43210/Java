public class HousingClient
{

		public static void main( String[] args )
		{

				System.out.println("Build a WoodenHouse\n");
				HouseTemplate houseType = new WoodenHouse();

				// using template method
				houseType.buildHouse();
				System.out.println("************************************************************");

				System.out.println("Build a GlassHouse\n");
				houseType = new GlassHouse();

				houseType.buildHouse();
		}

}