import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{

	public static void main(String[] args)
	{

		Duration duration = Duration.between(LocalTime.MIDNIGHT,LocalTime.NOON);
		System.out.println("duration = "+duration);
	  
		/*
		 * Returns:the whole seconds part of the length of the
		 * duration, positive or negative
		 */
		System.out.println("seconds"+duration.getSeconds());
	    
		/*
		 * Returns a copy of this duration with a positive length. 
		 */
		System.out.println("abs = "+duration.abs());
	    
	    

	}

}
