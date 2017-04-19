import java.util.ArrayList;

public class AnnotationsDemo
{

	/*
	 * If you remove the @SuppressWarnings("unchecked")
	 * annotation, it will show warning at compile time
	 * because we are using non-generic collection.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add("Ram");
		list.add("Peter");

		for (Object obj : list)
		{
			System.out.println(obj);
		}

	}
}