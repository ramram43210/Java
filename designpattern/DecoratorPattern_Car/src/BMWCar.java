public class BMWCar implements Car
{

		private final String CARNAME = "BMW";
		private String       carBody;
		private String       carDoor;
		private String       carWheels;
		private String       carGlass;
		private String       engine;

		public String getCarBody()
		{
				return carBody;
		}

		public void setCarBody( String carBody )
		{
				this.carBody = carBody;
		}

		public String getCarDoor()
		{
				return carDoor;
		}

		public void setCarDoor( String carDoor )
		{
				this.carDoor = carDoor;
		}

		public String getCarWheels()
		{
				return carWheels;
		}

		public void setCarWheels( String carWheels )
		{
				this.carWheels = carWheels;
		}

		public String getCarGlass()
		{
				return carGlass;
		}

		public void setCarGlass( String carGlass )
		{
				this.carGlass = carGlass;
		}

		public String getCARNAME()
		{
				return CARNAME;
		}

		public String getEngine()
		{
				return engine;
		}

		public void setEngine( String engine )
		{
				this.engine = engine;
		}

		@Override
		public String toString()
		{
				return "BMWCar [CARNAME=" + CARNAME + ", carBody=" + carBody + ", carDoor=" + carDoor + ", carWheels="
				                + carWheels + ", carGlass=" + carGlass + ", engine=" + engine + "]";
		}

		@Override
		public Car manufactureCar()
		{
				this.carBody = "carbon fiber material";
				this.carDoor = "4 car doors";
				this.carGlass = "6 car glasses";
				this.carWheels = "4 MRF wheels";
				return this;
		}
}