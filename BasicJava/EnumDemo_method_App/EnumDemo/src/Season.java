public enum Season
{
	WINTER(5), SPRING(10), SUMMER(15), FALL(20);

	private int seasonNumber;

	private Season(int seasonNumber)
	{
		this.seasonNumber = seasonNumber;
	}

	public int getSeasonNumber()
	{
		return seasonNumber;
	}
}