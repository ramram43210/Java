public class PackageInfo
{

	public static void main(String[] args)
	{
		Package packageObj = Package.getPackage("java.util");

		System.out.println("package name: " + packageObj.getName());

		System.out.println("Specification Title: "
				+ packageObj.getSpecificationTitle());
		System.out.println("Specification Vendor: "
				+ packageObj.getSpecificationVendor());
		System.out.println("Specification Version: "
				+ packageObj.getSpecificationVersion());

		System.out.println("Implementaion Title: "
				+ packageObj.getImplementationTitle());
		System.out.println("Implementation Vendor: "
				+ packageObj.getImplementationVendor());
		System.out.println("Implementation Version: "
				+ packageObj.getImplementationVersion());
		System.out.println("Is sealed: " + packageObj.isSealed());

	}

}
