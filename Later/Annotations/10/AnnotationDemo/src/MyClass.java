import java.lang.annotation.Documented;

@Documented
@interface MyAnnotation
	{

	}

@MyAnnotation
public class MyClass
{
	public static void main(String[] args)
	{
		//javadoc MyClass.java
	}
}