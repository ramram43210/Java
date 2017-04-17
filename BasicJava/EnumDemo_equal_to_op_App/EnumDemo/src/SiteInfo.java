public enum SiteInfo
{
	AMAZON("https://www.amazon.in/"), 
	PAYTM("https://www.paytm.com"), 
	SNAPDEAL("https://www.snapdeal.com/");

	private String url;

	SiteInfo(String url)
	{
		this.url = url;
	}

	public String getUrl()
	{
		return url;
	}
}