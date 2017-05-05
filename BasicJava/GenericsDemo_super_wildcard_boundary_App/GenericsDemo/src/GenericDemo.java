import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String[] args)
	{
		GenericDemo genericDemo = new GenericDemo();
		
		List<A>      listA      = new ArrayList<A>();
		genericDemo.insertElements(listA);		
		System.out.println("listA = "+listA);

		List<Object> listObject = new ArrayList<Object>();
		genericDemo.insertElements(listObject);		
		System.out.println("listObject =  "+listObject);
	}

	public void insertElements(List<? super A> list)
	{
		list.add(new A());
		list.add(new B());
		list.add(new C());
	}

}
