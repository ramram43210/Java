import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface MyMultiValueAnnotation
	{
		int getValue() default 2;

		String getMessage() default "hello";

		double getDoubleValue() default 5.5;
	}

public class Message
{
	@MyMultiValueAnnotation
	public void displayHi()
	{
		System.out.println("Hi");
	}
}

