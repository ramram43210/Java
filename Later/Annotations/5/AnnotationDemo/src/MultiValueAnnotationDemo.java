import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMultiValueAnnotation
{
	int getValue();

	String getMessage();
}

class Message
{
	@MyMultiValueAnnotation(getValue = 500, getMessage = "Welcome")
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

	}

}
