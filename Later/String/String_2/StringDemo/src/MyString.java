/*
 * MyString is an immutable class. MyString's 
 * state cannot be changed once it is created.
 * 
 * We can't subclass the final class and 
 * alter the behavior.
 */
public final class MyString
{

	final String str;

	MyString(String s)
	{
		this.str = s;
	}

	public String getStr()
	{
		return str;
	}
}
