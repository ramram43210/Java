public class EnumDemo
{
	public static void main(String[] args)
	{
		Company[] companyArray= Company.values();
		for (Company cName : companyArray)
		{
			System.out.println("Company Code: " + cName.getCompanyCode()
					+ " - Company Name: " + cName);
		}
	}
}