public class ExceptionPropagationDemo2
{

	public static void main(String[] args)
	{
		ExceptionPropagationDemo2 exceptionPropagationDemo2 = new ExceptionPropagationDemo2();
		exceptionPropagationDemo2.method1();
		System.out.println("Normal flow.");
	}

	public void method1()
	{
		System.out.println("method1() is called.");
		method2();
		System.out.println("method1 completed.");
	}

	public void method2()
	{
		System.out.println("method2() is called.");
		method3();
	}

	public void method3()
	{
		System.out.println("method3() is called.");
		String str = null;
		System.out.println(str.length());
	}

}
