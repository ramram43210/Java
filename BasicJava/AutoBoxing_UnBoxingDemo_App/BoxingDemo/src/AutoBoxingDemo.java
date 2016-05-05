public class AutoBoxingDemo
{

	public static void main(String[] args)
	{
		int intValue = 50;
		Integer integerObj = intValue;// Boxing
		System.out.println(integerObj);
		
		display(intValue); //Boxing
	}
	
	public static void display(Integer integerObj)
	{
		System.out.println(integerObj);
	}

}
