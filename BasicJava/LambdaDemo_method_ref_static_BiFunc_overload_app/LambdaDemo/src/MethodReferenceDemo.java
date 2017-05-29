import java.util.function.BiFunction;

/**
 *
 * We can also override static methods by referring methods. In the
 * following example, we have defined and overloaded three add
 * methods.
 *
 */

class Arithmetic
{
	public static int add(int a, int b)
	{
		return a + b;
	}

	public static float add(int a, float b)
	{
		return a + b;
	}

	public static float add(float a, float b)
	{
		return a + b;
	}
}

public class MethodReferenceDemo
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;

		int result1 = adder1.apply(10, 20);
		System.out.println(result1);
		
		float result2 = adder2.apply(10, 20.3f);
		System.out.println(result2);
		
		float result3 = adder3.apply(10.6f, 20.8f);		
		System.out.println(result3);
	}
}