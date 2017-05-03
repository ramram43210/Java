import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericDemo
{
	public static void main(String[] args)
			throws IllegalAccessException, InstantiationException
	{

		String stringElement = "Peter";
		List<String> stringList = new ArrayList<String>();

		String strReturnElement = addAndReturn(stringElement, stringList);
		System.out.println(strReturnElement);

		Integer integerElement = new Integer(500);
		List<Integer> integerList = new ArrayList<Integer>();

		Integer integerReturnElement = addAndReturn(integerElement,
														integerList);
		System.out.println(integerReturnElement);

	}

	public static <T> T addAndReturn(T element, Collection<T> collection)
	{
		collection.add(element);
		return element;
	}

}