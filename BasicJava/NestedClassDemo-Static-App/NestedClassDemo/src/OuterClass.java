public class OuterClass
{

	private int outerVariable = 10;
	private static int staticOuterVariable = 200;

	public void outerDisplay()
	{
		System.out.println("outerDisplay method has been called...");
	}

	public static void staticOuterDisplay()
	{
		System.out.println("staticOuterDisplay method has been called...");
	}

	static class StaticNestedClass
	{
		int innerVariable = 2000;

		public void innerDisplay()
		{
			System.out.println("innerDisplay method has been called...");
			System.out.println("innerVariable : " + innerVariable);
			System.out.println("staticOuterVariable : " + staticOuterVariable);
			staticOuterDisplay();

			// System.out.println("outerVariable : " + outerVariable);
			// outerDisplay();
		}
	}

}
