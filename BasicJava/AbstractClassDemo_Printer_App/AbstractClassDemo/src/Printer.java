public abstract class Printer
{
	abstract void print();// no body and abstract

}

class LaserPrinter extends Printer
{

	@Override
	void print()
	{
		System.out.println("Printing...");

	}

}