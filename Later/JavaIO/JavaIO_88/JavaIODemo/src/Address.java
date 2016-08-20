import java.io.Serializable;

public class Address implements Serializable
{
	private static final long serialVersionUID = 8899023823185198093L;
	private String streetName;
	private String city;
	private String state;

	public Address(String streetName, String city, String state)
	{
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public String getStreetName()
	{
		return streetName;
	}

	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		return "Address [streetName=" + streetName + ", city=" + city
				+ ", state=" + state + "]";
	}

}
