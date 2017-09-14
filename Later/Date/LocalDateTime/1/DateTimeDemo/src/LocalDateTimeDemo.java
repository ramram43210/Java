import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();  
        System.out.println("Before Formatting: " + localDateTime);  
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = localDateTime.format(dateTimeFormatter);  
        System.out.println("After Formatting: " + formatDateTime);  
	}

}
