public class User
{

	private String userName;
	private String passWord;
	private String designation;

	public User(String userName, String passWord, String designation)
	{
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.designation = designation;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassWord()
	{
		return passWord;
	}

	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	@Override
	public String toString()
	{
		return "User [userName=" + userName + ", passWord=" + passWord + ", designation=" + designation + "]";
	}

}
