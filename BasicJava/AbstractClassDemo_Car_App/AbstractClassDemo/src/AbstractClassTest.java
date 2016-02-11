public class AbstractClassTest
{

	public static void main(String[] args)
	{
		Car carRef = new BMWCar();
		carRef.run();
		
		carRef = new HyundaiCar();
		carRef.run();
	}

}
