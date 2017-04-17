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