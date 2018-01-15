import java.text.CharacterIterator;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2
{
	public static void main(String[] args)
	{
		Format formatter = new SimpleDateFormat("MMM");

		/*
		 * Parameters:
		 * 
		 * obj - The object to format
		 * 
		 * Returns:
		 * 
		 * Attributed CharacterIterator describing the formatted
		 * value.
		 */
		CharacterIterator ci = formatter.formatToCharacterIterator(new Date());

		for (char ch = ci.first(); ch != CharacterIterator.DONE; ch = ci.next())
		{
			System.out.print(ch);
		}

	}

}
