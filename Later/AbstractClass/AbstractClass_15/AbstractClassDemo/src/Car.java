abstract class Car
{
	abstract void engine();
}

class HondaCar extends Car
{

	@Override
	void engine()
	{
		System.out.println("Honda Car Engine Implementation...");
		// Honda Car implementation

	}

}

class SwiftCar extends Car
{

	@Override
	void engine()
	{
		System.out.println("Swift Car Engine Implementation...");
		// Swift Car implementation
	}

}
