import java.util.LinkedList;

public class OutOfMemoryErrorDemo
{

	public static void main(String[] args)
	{
		String str = "Peter";
		LinkedList<String> linkedList = new LinkedList<String>();	
		while(true)
		{
			str=str+" Welcome to India";
			linkedList.add(str);			
		}
	}

}
