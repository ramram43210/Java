public interface InterfaceB extends InterfaceA
{
	default public void sayWelcome()
	{
		System.out.println("Welcome by InterfaceB");
	}
}
