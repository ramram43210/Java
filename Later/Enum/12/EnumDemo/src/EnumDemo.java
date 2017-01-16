public class EnumDemo
{
	public static void main(String[] args)
	{
		for (Company cName : Company.values())
		{
			System.out.println("Company Code: " + cName.getCompanyCode()
					+ " - Company Name: " + cName);
		}
	}
}