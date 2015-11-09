class SwitchDemo
{
	public static void main(String[] args)
	{

		int month = 3;
		String monthValue;
		switch (month)
		{
		case 1:
			monthValue = "January";
			break;
		case 2:
			monthValue = "February";
			break;
		case 3:
			monthValue = "March";
			break;
		case 4:
			monthValue = "April";
			break;
		case 5:
			monthValue = "May";
			break;
		case 6:
			monthValue = "June";
			break;
		case 7:
			monthValue = "July";
			break;
		case 8:
			monthValue = "August";
			break;
		case 9:
			monthValue = "September";
			break;
		case 10:
			monthValue = "October";
			break;
		case 11:
			monthValue = "November";
			break;
		case 12:
			monthValue = "December";
			break;
		default:
			monthValue = "Invalid month";
			break;
		}
		System.out.println("Month is : "+monthValue);
	}
}