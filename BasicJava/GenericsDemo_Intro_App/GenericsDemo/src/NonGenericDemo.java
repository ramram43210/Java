import java.util.ArrayList;

public class NonGenericDemo
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("Peter");
		arrayList.add(new Integer(10));
		System.out.println(arrayList);
		String stringValue = (String)arrayList.get(0);
		Integer integerValue = (Integer)arrayList.get(1);
		System.out.println("stringValue  = " +stringValue);
		System.out.println("integerValue = " +integerValue);
	}
}