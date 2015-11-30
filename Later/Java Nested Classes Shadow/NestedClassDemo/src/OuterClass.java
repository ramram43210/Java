/*
 * If a declaration of a type (such as a member variable or a parameter name) 
 * in a particular scope (such as an inner class or a method definition) has 
 * the same name as another declaration in the enclosing scope, then the declaration 
 * shadows the declaration of the enclosing scope. 
 * You cannot refer to a shadowed declaration by its name alone.
 */

public class OuterClass
{

	public int x = 10;

	class InnerClass
	{
		public int x = 500;

		public void innerDisplay(int x)
		{
			System.out.println("x = " + x);

			System.out.println("this = " + this);

			System.out.println("this.x = " + this.x);

			System.out.println("OuterClass.this = " + OuterClass.this);

			System.out.println("OuterClass.this.x = " + OuterClass.this.x);
		}
	}

}
