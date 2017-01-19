import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMultiValueAnnotation
{
	int getValue() default 2;

	String getMessage() default "hello";
	
	double getDoubleValue() default 5.5;
}

class Message
{
	@MyMultiValueAnnotation
	public void displayHi()
	{
		System.out.println("Hi");
	}
}

public class MultiValueAnnotationDemo
{

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException
	{
		Message message = new Message();
		Method method = message.getClass().getMethod("displayHi");

		MyMultiValueAnnotation mmva = method
				.getAnnotation(MyMultiValueAnnotation.class);

		System.out.println("value is: " + mmva.getValue());
		System.out.println("message is: " + mmva.getMessage());
		System.out.println("DoubleValue is: " + mmva.getDoubleValue());

	}

}
