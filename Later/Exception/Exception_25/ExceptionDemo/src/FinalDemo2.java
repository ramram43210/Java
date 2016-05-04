class SuperClass
{
    final void methodOfSuperClass()
    {
        System.out.println("final Method");
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
        //Compile time error, final method can not be overridden.
    }
}

public class FinalDemo2
{
	public static void main(String[] args)
	{
		SuperClass superClass = new SubClass();
		superClass.methodOfSuperClass();
	}

}