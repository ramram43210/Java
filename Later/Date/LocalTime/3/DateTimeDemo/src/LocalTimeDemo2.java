import java.time.LocalTime;

public class LocalTimeDemo2
{

	public static void main(String[] args)
	{
		LocalTime time1 = LocalTime.now();  
	    System.out.println("time1         = "+time1);  
	    
	    System.out.println();
	    
	    LocalTime time2=time1.plusHours(2);
	    System.out.println("Hours Changed = "+time2);
	    
	    
	    LocalTime time3=time1.plusMinutes(30);  
	    System.out.println("Min Changed   = "+time3);  
	    
	    LocalTime time4=time1.plusSeconds((10));  
	    System.out.println("Sec Changed   = "+time4);  
	}

}
