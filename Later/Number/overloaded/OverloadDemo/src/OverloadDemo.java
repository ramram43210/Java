/*
 * Example of overloaded method with different return types. 
 */
public class OverloadDemo
{
	public char[] getName()
	{
		char[] nameArray =
		{ 'P', 'e', 't', 'e', 'r' };
		return nameArray;
	}

	public String getName(String name)
	{
		return "Mr." + name;
	}

	public static void main(String[] args)
	{
		OverloadDemo overloadDemoObj = new OverloadDemo();

		char[] nameArray = overloadDemoObj.getName();
		System.out.println("nameArray = " + new String(nameArray));

		String name = overloadDemoObj.getName("Stephan");
		System.out.println("name = " + name);

	}
}
