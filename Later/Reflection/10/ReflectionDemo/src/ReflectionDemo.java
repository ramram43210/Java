import java.util.ArrayList;

public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<ArrayList> classObj = ArrayList.class;
		/*
		 * Gets the package for this class. The class loader of this class is
		 * used to find the package.
		 */
		Package packageObj = classObj.getPackage();
		/*
		 * Returns:The fully-qualified name of this package
		 */
		System.out.println("Package Name = " + packageObj.getName());
		/*
		 * Returns:the title of the implementation, null is returned if it is not known.
		 */
		System.out.println("ImplementationTitle = "+packageObj.getImplementationTitle());
		/*
		 * Returns:the version of the implementation, null is returned if it is not known.
		 */
		System.out.println("ImplementationVersion = "+packageObj.getImplementationVersion());
		/*
		 * Returns:the specification vendor, null is returned if it is not known.
		 */
		System.out.println("SpecificationVendor = "+packageObj.getSpecificationVendor());
		
		/*
		 * Returns:the specification title, null is returned if it is not known.
		 */
		System.out.println("SpecificationTitle = "+packageObj.getSpecificationTitle());
	}

}