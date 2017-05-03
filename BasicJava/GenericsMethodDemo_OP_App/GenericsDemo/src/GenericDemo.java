public class GenericDemo
{

	public static void main(String[] args)
	{
		OrderPair<Integer, String> p1 = new OrderPair<Integer, String>(1, "apple");
		OrderPair<Integer, String> p2 = new OrderPair<Integer, String>(1, "apple");
		boolean same = GenericDemo.compare(p1, p2);
		
		//Like below also we can invoke. 
		//boolean same = GenericDemo.<Integer, String>compare(p1, p2);
		System.out.println("is p1 and p2 are same? = " + same);

	}

	public static <K, V> boolean compare(OrderPair<K, V> p1,
													OrderPair<K, V> p2)
	{
		return p1.getKey().equals(p2.getKey())
				&& p1.getValue().equals(p2.getValue());
	}

}
