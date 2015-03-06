public abstract class CarDecorator implements Car
{
		Car car;

		public CarDecorator( Car car )
		{
				super();
				this.car = car;
		}

		public Car manufactureCar()
		{
				return car.manufactureCar();
		}
}