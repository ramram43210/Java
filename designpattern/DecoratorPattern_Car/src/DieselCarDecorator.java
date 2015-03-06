public class DieselCarDecorator extends CarDecorator
{

		public DieselCarDecorator( Car car )
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
						BMWCar.setEngine("Diesel Engine");
						System.out.println("DieselCarDecorator added Diesel Engine to the Car : " + car);
				}

		}
}