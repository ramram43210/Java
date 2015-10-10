public class FloatingPointLiteralDemo
{

	public static void main(String[] args)
	{

		double d1 = 123.4;

		System.out.println("d1 : " + d1);

		double d2 = 1.234e2; // same value as d1, but in scientific notation

		System.out.println("d2 : " + d2);

		float f1 = 123.4f;

		System.out.println("f1 : " + f1);

		double d3 = 3.4d;

		System.out.println("d3 : " + d3);
		
		double num = 1_567_2_82.0;
		
		System.out.println("num : " + num);

	}
}
