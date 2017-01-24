import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
@interface MyAnnotation
	{
		int getValue() default 2;

		String getMessage() default "hello";

		double getDoubleValue() default 5.5;
	}


@MyAnnotation
public class HelloWorld
{
	@MyAnnotation
	private int value;
	
	@MyAnnotation
	public void displayHelloWorld()
	{
		System.out.println("Hello World");
	}
}
