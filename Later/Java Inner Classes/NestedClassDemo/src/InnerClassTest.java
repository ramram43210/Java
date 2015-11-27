public class InnerClassTest
{

	public static void main(String[] args)
	{
		OuterClass outClassObj = new OuterClass();
		OuterClass.InnerClass innerClassObj = outClassObj.new InnerClass();
		innerClassObj.innerDisplay();
	}

}
