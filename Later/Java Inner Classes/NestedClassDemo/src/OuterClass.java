public class OuterClass
{

	private int outerVariable = 10;
	
	public void outerDisplay()
	{
		System.out.println("outerDisplay method has been called...");
	}

	class InnerClass
	{
		int innerVariable=2000;

		public void innerDisplay()
		{
			System.out.println("innerDisplay method has been called...");
			System.out.println("outerVariable : " + outerVariable);
			System.out.println("innerVariable : " + innerVariable);
			outerDisplay();
		}
	}

}
