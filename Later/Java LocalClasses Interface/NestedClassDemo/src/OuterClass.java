public class OuterClass
{

	private String name = "John";

	public void greetInEnglish() 
	{
		/*
		 * We cannot declare an interface inside a block.
		 */
        interface Hello
        {
           public void greet();
        }
        
        class EnglishHello implements Hello 
        {
            public void greet() 
            {
                System.out.println("Hello " + name);
            }
        }
        
        Hello myGreeting = new EnglishHello();
        myGreeting.greet();
	}
}
