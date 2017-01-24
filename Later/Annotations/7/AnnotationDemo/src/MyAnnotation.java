import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface MyAnnotation
	{
		int value1();

		String value2();
	}