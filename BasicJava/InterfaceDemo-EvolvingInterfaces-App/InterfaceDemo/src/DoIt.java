public interface DoIt
{
	void sayHi();
	
	default void sayBye()
	{
		System.out.println("bye...");
	}
}
