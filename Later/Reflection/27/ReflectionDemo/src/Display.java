import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

@interface MyAnnotation
{
	public String name();

	public String value();
}

@MyAnnotation(name = "age", value = "23")
public class Display
{

}
