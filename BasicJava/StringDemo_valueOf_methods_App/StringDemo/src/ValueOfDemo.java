public class ValueOfDemo
{

	public static void main(String[] args)
	{
		int intValue=30;  
		String str=String.valueOf(intValue);
		System.out.println(str);
		
		double doubleValue=30;  
		str=String.valueOf(doubleValue);
		System.out.println(str);
		
		char[] charArray ={'H','i'};;
		str=String.valueOf(charArray);
		System.out.println(str);
		
		boolean value = true;
		str=String.valueOf(value);
		System.out.println(str);		
	}

}