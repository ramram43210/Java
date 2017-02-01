import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Step 1: Declare a Repeatable Annotation Type
 * 
 * The annotation type must be marked with the 
 * @Repeatable meta-annotation
 */
@Repeatable(value = Cars.class)
@interface Manufacturer
	{
		String name();
	};

/*
 * Step 2: Declare the Containing Annotation Type
 * 
 * The containing annotation type must have a value element
 * with an array type. The component type of the array type
 * must be the repeatable annotation type.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Cars
	{
		Manufacturer[] value() default
		{};
	}

@Manufacturer(name = "Mercedes Benz")
@Manufacturer(name = "Toyota")
@Manufacturer(name = "BMW")
@Manufacturer(name = "Range Rover")
public interface Car
{

}
