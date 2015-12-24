//OuterClass
public class A
{

	private int value = 10;

	//InnerClass
	class B
	{
		int c;

		public void innerDisplay()
		{
			System.out.println("value : " + value);
		}
	}

}
