/**
 * 
 * MarutiSwift is specific type of Car which extends Car class means MarutiSwift
 * IS-A Car.
 * 
 * MarutiSwift extends Car and thus inherits all properties and methods from Car
 * (except final and static).
 * 
 * MarutiSwift can also define all its specific functionality.
 */
public class MarutiSwift extends Car
{
	/*
	 * MarutiSwift HAS-A Engine
	 */
	private Engine engine;

	public MarutiSwift(String color, int maxSpeed, Engine engine)
	{
		super(color, maxSpeed);
		this.engine = engine;
	}

	public void startMarutiSwift()
	{
		engine.start();
	}

}
