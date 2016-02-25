public class valueOfDemo
{

	public static void main(String[] args)
	{
		int intValue=30;  
		String str1=String.valueOf(intValue);
		System.out.println(str1);
		
		double doubleValue=30;  
		str1=String.valueOf(doubleValue);
		System.out.println(str1);
		
		char[] charArray ={'H','i'};;
		str1=String.valueOf(charArray);
		System.out.println(str1);
		
		boolean value = true;
		str1=String.valueOf(value);
		System.out.println(str1);		
	}

}