public class OuterClass
{

	int a;

	public void outerDisplay()
	{
		System.out.println("Outer class display method : ");
	}

	/*
	 * Nested classes that are declared static are called static nested classes.
	 * 
	 * Static nested classes do not have access to other members of the
	 * enclosing class.
	 */
	static class StaticNestedClass
	{
		int b;

		public void nestedStaticDisplay()
		{
			System.out.println("nested Static Display method : ");
		}
	}

	/*
	 * Non-static nested classes are called inner classes.
	 * 
	 * As a member of the OuterClass, a nested class can be
	 * declared private, public, protected, or package private. (outer classes
	 * can only be declared public or package private.).
	 * 
	 * Non-static nested classes (inner classes) have access to other members of
	 * the enclosing class, even if they are declared private. 
	 */
	class InnerClass
	{
		int c;

		public void innerDisplay()
		{
			System.out.println("inner Display method : ");
		}
	}

}
