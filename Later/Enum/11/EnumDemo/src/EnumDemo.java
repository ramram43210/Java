public class EnumDemo
{
	public static void main(String[] args)
	{
		MultiNationalCompany paypal = new MultiNationalCompany(Company.PAYPAL);
		paypal.getCompanyDetails();
		MultiNationalCompany google = new MultiNationalCompany(Company.GOOGLE);
		google.getCompanyDetails();
		MultiNationalCompany yahoo = new MultiNationalCompany(Company.YAHOO);
		yahoo.getCompanyDetails();
	}
}