public class LedTV
{

	private String displaySize;
	private boolean isSmartTv;

	public LedTV(String displaySize, boolean isSmartTv)
	{
		super();
		this.displaySize = displaySize;
		this.isSmartTv = isSmartTv;
	}

	public String getDisplaySize()
	{
		return displaySize;
	}

	public void setDisplaySize(String displaySize)
	{
		this.displaySize = displaySize;
	}

	public boolean isSmartTv()
	{
		return isSmartTv;
	}

	public void setSmartTv(boolean isSmartTv)
	{
		this.isSmartTv = isSmartTv;
	}
	
	public void switchOnTV()
	{
		System.out.println("switchOnTV method of LEDTV is called.");
		System.out.println("LED TV is Switched on.");
	}

	public void switchOffTV()
	{
		System.out.println("switchOffTV method of LEDTV is called.");
		System.out.println("LED TV is Switched off.");
	}

}
