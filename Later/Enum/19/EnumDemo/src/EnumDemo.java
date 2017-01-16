enum SiteInfo
{
	AMAZON("https://www.amazon.in/"), PAYTM("https://www.paytm.com"), SNAPDEAL(
			"https://www.snapdeal.com/");

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

public class EnumDemo
{
	public static void main(String[] args)
	{
		getSiteInfo(SiteInfo.PAYTM);
	}

	private static void getSiteInfo(SiteInfo siteInfo)
	{

		switch (siteInfo)
		{
		case AMAZON:
			System.out.println("URL : " + siteInfo.getUrl());
			break;
		case PAYTM:
			System.out.println("URL : " + siteInfo.getUrl());
			break;
		case SNAPDEAL:
			System.out.println("URL : " + siteInfo.getUrl());
			break;
		default:
			System.out.println("Not a valid site.. " );	
		}
	}
}