import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements
        ServletRequestAttributeListener
{

	@Override
	public void attributeAdded(
	        ServletRequestAttributeEvent servletRequestAttributeEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeAdded method has been called in "
		        + this.getClass().getName());

		System.out.println("Newly added Attribute Name ="
		        + servletRequestAttributeEvent.getName() + ",value = "
		        + servletRequestAttributeEvent.getValue());

		System.out.println("\n#####################################\n");

		/*
		 * if particular Attribute is added, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void attributeRemoved(
	        ServletRequestAttributeEvent servletRequestAttributeEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeRemoved method has been called "
		        + this.getClass().getName());

		System.out.println("Removed Attribute Name ="
		        + servletRequestAttributeEvent.getName() + ",value = "
		        + servletRequestAttributeEvent.getValue());

		System.out.println("\n###################################\n");

		/*
		 * if particular Attribute is Removed, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

	@Override
	public void attributeReplaced(
	        ServletRequestAttributeEvent servletRequestAttributeEvent )
	{
		System.out.println("\n###################################\n");

		System.out.println("attributeReplaced method has been called "
		        + this.getClass().getName());

		System.out.println("Replaced Attribute Name ="
		        + servletRequestAttributeEvent.getName() + ",value = "
		        + servletRequestAttributeEvent.getValue());

		System.out.println("\n###################################\n");

		/*
		 * if particular Attribute is Replaced, based on that if you want to
		 * perform any operation then you can do it here.
		 */

	}

}
