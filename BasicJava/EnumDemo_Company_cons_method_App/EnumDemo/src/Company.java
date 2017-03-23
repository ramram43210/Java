enum Company
{
	PAYPAL(101), GOOGLE(201), YAHOO(301);

	private int companyCode;

	private Company(int companyCode)
	{
		this.companyCode = companyCode;
	}

	public int getCompanyCode()
	{
		return companyCode;
	}

}
