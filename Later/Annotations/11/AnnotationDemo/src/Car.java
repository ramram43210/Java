import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * The repeating annotation has to be 
 * annotated with @Repeatable annotation.
 */
@Repeatable(value = Cars.class)
@interface Manufacturer
	{
		String value();
	};

@Manufacturer("Mercedes Benz")
@Manufacturer("Toyota")
@Manufacturer("BMW")
@Manufacturer("Range Rover")
public interface Car
{

}

@Retention(RetentionPolicy.RUNTIME)
@interface Cars
	{
		Manufacturer[] value() default
		{};
	}
