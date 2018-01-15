import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1
{
	public static void main(String[] args)
	{
		SimpleDateFormat formatter = new SimpleDateFormat();

		StringBuffer sb = new StringBuffer();

		/*
		 * Parameters:
		 * 
		 * date - the date-time value to be formatted into a date-time
		 * string.
		 * 
		 * toAppendTo - where the new date-time text is to be
		 * appended.
		 * 
		 * pos - the formatting position. On input: an alignment
		 * field, if desired. On output: the offsets of the alignment
		 * field.
		 * 
		 * Returns:
		 * 
		 * the formatted date-time string.
		 */
		formatter.format(new Date(), sb,
				new FieldPosition(DateFormat.DATE_FIELD));
		System.out.println(sb);
	}

}
