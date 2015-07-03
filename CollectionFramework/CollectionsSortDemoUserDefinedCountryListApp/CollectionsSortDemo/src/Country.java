public class Country implements Comparable<Object>
{
	private int countryId;
	private String countryName;

	public Country(int countryId, String countryName)
	{
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public int getCountryId()
	{
		return countryId;
	}

	public void setCountryId(int countryId)
	{
		this.countryId = countryId;
	}

	public String getCountryName()
	{
		return countryName;
	}

	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}

	/*
	 * This method has logic to arrange the Country objects in Ascending order based
	 * on CountryId
	 */
	@Override
	public int compareTo(Object object)
	{

		System.out.println("\n"+"compareTo method is called by sort method : "+ object);
		/*
		 * If this.countryId < country.countryId:then compare method will return
		 * -1
		 * 
		 * If this.countryId > country.countryId:then compare method will return
		 * 1
		 * 
		 * If this.countryId==country.countryId:then compare method will return
		 * 0
		 */

		Country country = (Country) object;

		return (this.countryId < country.countryId) ? -1
				: (this.countryId > country.countryId) ? 1 : 0;
	}

}