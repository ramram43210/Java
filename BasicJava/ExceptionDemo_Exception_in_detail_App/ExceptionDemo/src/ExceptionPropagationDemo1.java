public class ExceptionPropagationDemo1
{

	public static void main(String[] args)
	{
		ExceptionPropagationDemo1 exceptionPropagationDemo1 = new ExceptionPropagationDemo1();
		exceptionPropagationDemo1.method1();
		System.out.println("Normal flow.");
	}

	public void method1()
	{
		System.out.println("method1() is called.");
		try
		{
			method2();
		}
		catch(NullPointerException nullPointerException)
		{
			nullPointerException.printStackTrace();
			System.out.println("Exception handled in method1().");
		}
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
