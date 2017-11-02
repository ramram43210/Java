import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface MyAnnotation
{
	public String name();

	public String value();
}

public class Display
{
	@MyAnnotation(name = "Country",	value = "India")
	public void doSomething()
	{
	}
}
