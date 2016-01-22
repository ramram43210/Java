public abstract class Bike
{
	Bike()
	{
		System.out
				.println("abstract class Bike constructor is called.");
	}

	/*
	 * If there is any abstract method in a class, that
	 * class must be abstract.
	 */
	abstract void run();

	void changeGear()
	{
		System.out.println("gear changed");
	}
}

/*
 * If you are extending any abstract class that have
 * abstract method, you must either provide the
 * implementation of the method or make this class abstract.
 */
class Honda extends Bike
{

	public Honda()
	{
		super();
	}

	void run()
	{
		System.out.println("running safely..");
	}
}
