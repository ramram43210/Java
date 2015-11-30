public class ShadowTest
{

	public static void main(String[] args)
	{
		OuterClass outerClassObj = new OuterClass();
		OuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
		innerClassObj.innerDisplay(2000);
	}

}
