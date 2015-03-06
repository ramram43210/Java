public class PetrolCarDecorator extends CarDecorator
{

		public PetrolCarDecorator( Car car )
		{
				super(car);
		}
		
		public Car manufactureCar()
		{
				car.manufactureCar();
				addEngine(car);
				return car;
		}

		public void addEngine( Car car )
		{
				if( car instanceof BMWCar )
				{
						BMWCar BMWCar = (BMWCar) car;
						BMWCar.setEngine("Petrol Engine");
						System.out.println("PetrolEngineDecorator added Petrol Engine to the Car : " + car);
				}

		}
}