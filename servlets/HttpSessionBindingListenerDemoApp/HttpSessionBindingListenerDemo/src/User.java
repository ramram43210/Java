import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener
{

	private String name;
	private int age;

	public User(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public User(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent)
	{
		System.out.println("\n###################################\n");

		System.out.println("valueBound method has been called in "
				+ this.getClass().getName());

		System.out.println("Added/Replaced Attribute Name ="
				+ httpSessionBindingEvent.getName() + ",value = "
				+ httpSessionBindingEvent.getValue());

		System.out.println("\n#####################################\n");

		/*
		 * if particular Attribute is added/replaced, based on that if you want
		 * to perform any operation then you can do it here.
		 */

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent)
	{
		System.out.println("\n###################################\n");

		System.out.println("valueUnbound method has been called in "
				+ this.getClass().getName());

		System.out.println("Removed Attribute Name ="
				+ httpSessionBindingEvent.getName() + ",value = "
				+ httpSessionBindingEvent.getValue());

		System.out.println("\n#####################################\n");

		/*
		 * if particular Attribute is removed, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public String toString()
	{
		return "User [name=" + name + ", age=" + age + "]";
	}

}
