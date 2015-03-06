import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements
        ServletContextAttributeListener
{

	@Override
	public void attributeAdded(
	        ServletContextAttributeEvent servletContextAttributeEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeAdded method has been called in "
		        + this.getClass().getName());

		System.out.println("Newly added Attribute Name ="
		        + servletContextAttributeEvent.getName() + ",value = "
		        + servletContextAttributeEvent.getValue());

		System.out.println("\n#####################################\n");

		/*
		 * if particular Attribute is added, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void attributeRemoved(
	        ServletContextAttributeEvent servletContextAttributeEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeRemoved method has been called in "
		        + this.getClass().getName());

		System.out.println("Removed Attribute Name ="
		        + servletContextAttributeEvent.getName() + ",value = "
		        + servletContextAttributeEvent.getValue());

		System.out.println("\n###################################\n");

		/*
		 * if particular Attribute is Removed, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void attributeReplaced(
	        ServletContextAttributeEvent servletContextAttributeEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeReplaced method has been called in "
		        + this.getClass().getName());

		System.out.println("Replaced Attribute Name ="
		        + servletContextAttributeEvent.getName() + ",value = "
		        + servletContextAttributeEvent.getValue());

		System.out.println("\n###################################\n");

		/*
		 * if particular Attribute is Replaced, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

}
