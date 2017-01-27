import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
	{

	}

@MyAnnotation
class A
{

}

class B extends A
{

}

public class InheritedAnnotationDemo
{
	public static void main(String[] args)
	{
		System.out.println("Super class Annotation = "+new A().getClass().getAnnotation(
				MyAnnotation.class));
		
		System.out.println("Sub class Annotation = "+new B().getClass().getAnnotation(
				MyAnnotation.class));
	}
}