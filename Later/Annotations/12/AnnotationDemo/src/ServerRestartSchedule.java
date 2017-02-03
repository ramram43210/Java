import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Step 1: Declare a Repeatable Annotation Type
 * 
 * The annotation type must be marked with the
 * 
 * @Repeatable meta-annotation.
 * 
 * The value of the @Repeatable meta-annotation, in
 * parentheses, is the type of the container
 * annotation that the Java compiler generates to
 * store repeating annotations. In this example, the
 * containing annotation type is Schedules, so
 * repeating @Schedule annotations is stored in an
 * @Schedules annotation.
 */

@Repeatable(Schedules.class)
@interface Schedule
	{

		String dayOfMonth() default "first";

		String dayOfWeek() default "Mon";

		int hour() default 12;
	}

/*
 * Step 2: Declare the Containing Annotation Type
 * 
 * The containing annotation type must have a value element
 * with an array type. The component type of the array type
 * must be the repeatable annotation type.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Schedules
	{
		Schedule[] value();
	}

@Schedule
@Schedule(dayOfMonth = "second", dayOfWeek = "Tue", hour = 17)
@Schedule(dayOfMonth = "third", dayOfWeek = "Wed", hour = 24)
public class ServerRestartSchedule
{

}
