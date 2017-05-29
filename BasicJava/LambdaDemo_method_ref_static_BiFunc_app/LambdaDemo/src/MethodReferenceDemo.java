import java.util.function.BiFunction;

/**
 *
 * We are using predefined functional interface BiFunction and
 * referring a static method add(int a, int b) to it's functional
 * method apply(Integer t,Integer u).
 *
 */

class Arithmetic
{
	public static int add(int a, int b)
	{
		return a + b;
	}
}

public class MethodReferenceDemo
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(20, 20);
		System.out.println(result);
	}
}