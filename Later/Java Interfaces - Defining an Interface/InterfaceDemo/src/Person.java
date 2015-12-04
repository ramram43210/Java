public interface Person extends Interface1,Interface2,Interface3
{
	abstract void sayWelcome();
	
	default void displayMessage(String message)
	{
		System.out.println(message);
	}
	
	static void displayName(String name)
	{
		System.out.println(name);
	}
	
	class innerClass
	{
		//----
	}
}
