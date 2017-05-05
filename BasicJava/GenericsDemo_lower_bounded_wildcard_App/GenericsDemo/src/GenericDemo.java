import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String[] args)
	{
		
		List<Integer> integerList = new ArrayList<Integer>();
		addIntegers(integerList);

		List<Number> numberList = new ArrayList<Number>();
		addIntegers(numberList);

	}

	public static void addIntegers(List<? super Integer> list)
	{
		list.add(new Integer(50));
		System.out.println(list);
	}

}
