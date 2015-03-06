import java.util.Date;

public class DayExpression extends AbstractExpression
{

		@Override
		public void evaluate( Context context )
		{
				String expression = context.getExpression();
				Date date = context.getDate();
				Integer day = new Integer(date.getDate());
				String tempExpression = expression.replaceAll("DD", day.toString());
				context.setExpression(tempExpression);
		}
}
