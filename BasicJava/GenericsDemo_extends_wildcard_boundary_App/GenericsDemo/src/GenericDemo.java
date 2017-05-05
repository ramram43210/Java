import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String[] args)
	{
		GenericDemo genericDemo = new GenericDemo();

		List<A> listA = new ArrayList<A>();
		listA.add(new A());
		genericDemo.processElements(listA);

		List<B> listB = new ArrayList<B>();
		listB.add(new B());
		genericDemo.processElements(listB);

		List<C> listC = new ArrayList<C>();
		listC.add(new C());
		genericDemo.processElements(listC);
	}

	public void processElements(List<? extends A> list)
	{
		for (A a : list)
		{
			System.out.println(a.getClass());
			System.out.println("value =  "+a.getValue());
			System.out.println("------------");
		}
	}

}
