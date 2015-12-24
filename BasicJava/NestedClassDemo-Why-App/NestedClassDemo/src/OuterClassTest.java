public class OuterClassTest
{

	public static void main(String[] args)
	{
		A a = new A();
		A.B b = a.new B();
		b.innerDisplay();
	}

}
