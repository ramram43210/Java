import java.util.ArrayList;
import java.util.List;

public class UnBoxingDemo
{

	public static void main(String[] args)
	{
		Integer integerObj = new Integer(-8);

		// 1. Unboxing through method invocation
		int absVal = absoluteValue(integerObj);
		System.out.println("absolute value of " + integerObj + " = " + absVal);

		List<Double> list = new ArrayList<>();
		list.add(new Double(12.3)); 

		// 2. Unboxing through assignment
		double doubleValue = list.get(0);
		System.out.println("doubleValue = " + doubleValue);

	}

	public static int absoluteValue(int i)
	{
		return (i < 0) ? -i : i;
	}

}
