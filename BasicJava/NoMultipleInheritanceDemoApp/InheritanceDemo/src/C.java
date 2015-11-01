
class A
{
    public void displayMessage()
    {
    	System.out.println("Calling Class A displayMessage method");
    }
    
}

class B
{
	public void displayMessage()
    {
    	System.out.println("Calling Class B displayMessage method");
    }
}

class C extends A,B //suppose if it were 
{
	public static void main(String[] args)
	{
		 C obj=new C();
		 /*
		  * Now which displayMessage() method would be invoked?
		  * Class A displayMessage() method or Class B displayMessage() method?
		  */
		 obj.displayMessage();
	}
}