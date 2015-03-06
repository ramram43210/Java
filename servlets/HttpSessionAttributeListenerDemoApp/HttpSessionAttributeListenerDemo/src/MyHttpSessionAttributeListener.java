import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements
        HttpSessionAttributeListener
{

	@Override
	public void attributeAdded(
			HttpSessionBindingEvent httpSessionBindingEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeAdded method has been called in "
		        + this.getClass().getName());

		System.out.println("Newly added Attribute Name ="
		        + httpSessionBindingEvent.getName() + ",value = "
		        + httpSessionBindingEvent.getValue());

		System.out.println("\n#####################################\n");

		/*
		 * if particular Attribute is added, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void attributeRemoved(
			HttpSessionBindingEvent httpSessionBindingEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeRemoved method has been called in "
		        + this.getClass().getName());

		System.out.println("Removed Attribute Name ="
		        + httpSessionBindingEvent.getName() + ",value = "
		        + httpSessionBindingEvent.getValue());

		System.out.println("\n###################################\n");

		/*
		 * if particular Attribute is Removed, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void attributeReplaced(
			HttpSessionBindingEvent httpSessionBindingEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeReplaced method has been called in "
		        + this.getClass().getName());

		System.out.println("Replaced Attribute Name ="
		        + httpSessionBindingEvent.getName() + ",value = "
		        + httpSessionBindingEvent.getValue());

		System.out.println("\n###################################\n");

		/*
		 * if particular Attribute is Replaced, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

}
