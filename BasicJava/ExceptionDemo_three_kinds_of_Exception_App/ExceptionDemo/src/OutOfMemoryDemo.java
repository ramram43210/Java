import java.util.HashMap;
import java.util.LinkedHashMap;


public class OutOfMemoryDemo
{

	public static void main(String[] args)
	{
		String str = "Hello";
		HashMap<String,String> map = new LinkedHashMap<String,String>();
		while(true)
		{
			str = str+"Welcome to india";
			map.put(str, str);
		}

	}

}
