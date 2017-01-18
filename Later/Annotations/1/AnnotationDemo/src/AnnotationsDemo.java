import java.util.ArrayList;

public class AnnotationsDemo
{
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