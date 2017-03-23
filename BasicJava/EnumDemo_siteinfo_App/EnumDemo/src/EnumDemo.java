enum SiteInfo
{
	AMAZON("https://www.amazon.in/"), 
	PAYTM("https://www.paytm.com"), 
	SNAPDEAL("https://www.snapdeal.com/");

	private String url;

	private SiteInfo(String url)
	{
		this.url = url;
	}

	public String getUrl()
	{
		return url;
	}
}

public class EnumDemo
{
	public static void main(String[] args)
	{
		System.out.println(SiteInfo.PAYTM.getUrl());
	}
}