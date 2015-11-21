public class DisplayValue
{

	public static void main(String[] args)
	{
		DisplayValue displayValue = new DisplayValue();
		displayValue.displayValue("Hello");
		displayValue.displayValue(10);
		displayValue.displayValue(200, 400);
	}

	public void displayValue(String str)
	{
		System.out.println("displayValue(String str) has been called : " + str);
	}

	public void displayValue(int a)
	{
		System.out.println("displayValue(int a) has been called : " + a);
	}

	public void displayValue(int a, int b)
	{
		System.out.println("displayValue(int a,int b) : " + a + "," + b);
	}

}
