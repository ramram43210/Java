import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OutOfMemoryErrorDemo
{

	public static void main(String[] args)
	{
		Random random = new Random();
		Map<Integer,String> map = new HashMap<Integer,String>();
		String str = "Hello";
		
		while (true)
		{
			int randomValue = random.nextInt();
			str=str+"Peter";
			map.put(randomValue, str);
		}
	}

}
