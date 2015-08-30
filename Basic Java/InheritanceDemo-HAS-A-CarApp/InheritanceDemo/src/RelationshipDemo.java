/**
 * RelationsDemo class is making object of MarutiSwift class and initialized it.
 * Though MarutiSwift class does not have setColor(), setMaxSpeed() and carInfo()
 * methods still we can use it due to IS-A relationship of MarutiSwift class with Car
 * class.
 */

public class RelationshipDemo
{

	public static void main(String[] args)
	{

		Engine engine = new Engine();
		MarutiSwift marutiSwift = new MarutiSwift("Red", 200, engine);
		marutiSwift.carInfo();
		marutiSwift.startMarutiSwift();
	}
}
