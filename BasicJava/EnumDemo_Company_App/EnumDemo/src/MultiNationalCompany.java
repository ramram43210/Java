enum Company
{
	PAYPAL, GOOGLE, YAHOO
}

public class MultiNationalCompany
{

	private Company companyName;

	public MultiNationalCompany(Company companyName)
	{
		this.companyName = companyName;
	}

	public void getCompanyDetails()
	{
		switch (companyName)
		{
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;

		case GOOGLE:
			System.out.println("Google - biggest search giant.. ");
			break;

		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
		}
	}
}