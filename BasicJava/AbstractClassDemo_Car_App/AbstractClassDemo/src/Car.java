public abstract class Car
{
	abstract void run();

}

class BMWCar extends Car
{

	@Override
	void run()
	{
		System.out.println("BMW Car runs smoothly...");

	}

}

class HyundaiCar extends Car
{

	@Override
	void run()
	{
		System.out.println("Hyundai Car runs smoothly and fast...");

	}

}