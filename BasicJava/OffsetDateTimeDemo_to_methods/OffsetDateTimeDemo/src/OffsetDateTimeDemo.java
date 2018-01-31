import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println("offsetDateTime = " + offsetDateTime);

		Instant instant = offsetDateTime.toInstant();
		System.out.println("instant = " + instant);

		LocalDate localDate = offsetDateTime.toLocalDate();
		System.out.println("localDate = " + localDate);

		LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
		System.out.println("localDateTime = " + localDateTime);

		LocalTime localTime = offsetDateTime.toLocalTime();
		System.out.println("localTime = " + localTime);

		OffsetTime offsetTime = offsetDateTime.toOffsetTime();
		System.out.println("offsetTime = " + offsetTime);

		ZonedDateTime zonedDateTime = offsetDateTime.toZonedDateTime();
		System.out.println("zonedDateTime = " + zonedDateTime);
	}

}
