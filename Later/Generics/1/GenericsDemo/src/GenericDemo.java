import java.util.ArrayList;

public class GenericDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Peter");
		arrayList.add("Ram");
		System.out.println(arrayList);
		String stringValue = arrayList.get(0);
		System.out.println("stringValue = " +stringValue);
	}
}