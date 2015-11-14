class SwitchDemo
{
	public static void main(String[] args)
	{

		String month = "march";
		int monthNumber = 0;

		/*
		 * In Java SE 7 and later, you can use a String object in the switch
		 * statement's expression.
		 */
		switch (month)
		{
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		default:
			monthNumber = 0;
			break;
		}

		System.out.println("month number : " + monthNumber);

	}
}