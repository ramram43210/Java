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
		getSiteInfo(SiteInfo.SNAPDEAL);
	}

	private static void getSiteInfo(SiteInfo siteInfo)
	{

		/*
		 * We can compare the Enum values using == operator.
		 */
		if (siteInfo == SiteInfo.AMAZON)
		{
			System.out.println("URL : " + siteInfo.getUrl());
		}
		else if (siteInfo == SiteInfo.PAYTM)
		{
			System.out.println("URL : " + siteInfo.getUrl());
		}
		else if (siteInfo == SiteInfo.SNAPDEAL)
		{
			System.out.println("URL : " + siteInfo.getUrl());
		}
		else
		{
			System.out.println("Not a valid site...");
		}
	}
}