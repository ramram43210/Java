/*
 * As you can see in the below example, we are accessing the 
 * NestedInterface by its OuterInterface because 
 * it cannot be accessed directly. 
 * 
 * It is just like apple inside the box, we cannot access the apple directly 
 * because we must open the box first. 
 * 
 * In collection framework has provided a nested interface 
 * Entry. Entry is the sub-interface of Map i.e. accessed by Map.Entry.
 */

public class MyClass implements OuterInterface.NestedInterface
{

	@Override
	public void nestedMethod()
	{
		System.out.println("Nested Method has been called.");

	}

}
