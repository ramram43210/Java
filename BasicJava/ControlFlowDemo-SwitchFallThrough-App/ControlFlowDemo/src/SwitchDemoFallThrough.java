class SwitchDemoFallThrough
{
	public static void main(String[] args)
	{

		/*
		 * Each break statement terminates the enclosing switch statement.
		 * Control flow continues with the first statement following the switch
		 * block. The break statements are necessary because without them,
		 * statements in switch blocks fall through: All statements after the
		 * matching case label are executed in sequence, regardless of the
		 * expression of subsequent case labels, until a break statement is
		 * encountered.
		 */
		int month = 10;
		String monthValue;
		switch (month)
		{
		case 1:
			monthValue = "January";
			System.out.println("monthValue : " + monthValue);

		case 2:
			monthValue = "February";
			System.out.println("monthValue : " + monthValue);
		case 3:
			monthValue = "March";
			System.out.println("monthValue : " + monthValue);

		case 4:
			monthValue = "April";
			System.out.println("monthValue : " + monthValue);

		case 5:
			monthValue = "May";
			System.out.println("monthValue : " + monthValue);

		case 6:
			monthValue = "June";
			System.out.println("monthValue : " + monthValue);

		case 7:
			monthValue = "July";
			System.out.println("monthValue : " + monthValue);

		case 8:
			monthValue = "August";
			System.out.println("monthValue : " + monthValue);

		case 9:
			monthValue = "September";
			System.out.println("monthValue : " + monthValue);

		case 10:
			monthValue = "October";
			System.out.println("monthValue : " + monthValue);

		case 11:
			monthValue = "November";
			System.out.println("monthValue : " + monthValue);

		case 12:
			monthValue = "December";
			System.out.println("monthValue : " + monthValue);

		default:
			monthValue = "Invalid month";
			System.out.println("monthValue : " + monthValue);

		}
		System.out.println("Month is : " + monthValue);
	}
}