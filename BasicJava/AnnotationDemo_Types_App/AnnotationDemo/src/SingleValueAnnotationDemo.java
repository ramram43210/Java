import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingleValueAnnotation
{
	int getValue();
}

class Display
{
	@MySingleValueAnnotation(getValue = 20)
	public void displayHi()
	{
		System.out.println("Hi");
	}
}

public class SingleValueAnnotationDemo
{

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException
	{
		Display display = new Display();
		Method method = display.getClass().getMethod("displayHi");

		MySingleValueAnnotation msva = method
				.getAnnotation(MySingleValueAnnotation.class);

		System.out.println("value is: " + msva.getValue());

	}

}
