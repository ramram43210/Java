public class DecoratorClient
{

		public static void main( String[] args )
		{
				Car bmwCar1 = new BMWCar();
				bmwCar1.manufactureCar();
				System.out.println(bmwCar1+"\n");
				

				DieselCarDecorator carWithDieselEngine = new DieselCarDecorator(bmwCar1);
				carWithDieselEngine.manufactureCar();

				System.out.println("\n*******************************************************");

				Car bmwCar2 = new BMWCar();

				PetrolCarDecorator carWithPetrolEngine = new PetrolCarDecorator(bmwCar2);
				carWithPetrolEngine.manufactureCar();

		}
}