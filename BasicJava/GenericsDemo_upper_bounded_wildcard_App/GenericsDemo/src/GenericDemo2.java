import java.util.ArrayList;
import java.util.List;

public class GenericDemo2
{

	public static void main(String[] args)
	{
		List<Number> numberList= new ArrayList<Number>();
		numberList.add(2);
		numberList.add(3);
		numberList.add(5);
		double sum = sum(numberList);
		System.out.println("sum = " + sum);
		
		List<Integer> integerList= new ArrayList<Integer>();
		integerList.add(20);
		integerList.add(33);
		integerList.add(50);
		sum = sum(integerList);
		System.out.println("sum = " + sum);

	}

	public static double sum(List<? extends Number> list)
	{
		double sum = 0;
		for (Number n : list)
		{
			sum += n.doubleValue();
		}
		return sum;
	}

}
