class SwitchDemo
{
	public static void main(String[] args)
	{

		int month = 5;
		int numDays = 0;

		switch (month)
		{

		/*
		 * Shows how a statement can have multiple case labels
		 */

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
		System.out.println("Number of Days = " + numDays);

	}
}