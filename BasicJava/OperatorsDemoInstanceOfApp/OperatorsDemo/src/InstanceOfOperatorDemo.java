class InstanceOfOperatorDemo
{
	public static void main(String[] args)
	{
		Parent parentObject = new Parent();
		Parent childObject = new Child();

		System.out.println("parentObject instanceof Parent: "
				+ (parentObject instanceof Parent));

		System.out.println("parentObject instanceof Child: "
				+ (parentObject instanceof Child));

		System.out.println("parentObject instanceof Employee Interface: "
				+ (parentObject instanceof Employee));

		System.out.println();
		
		System.out.println("childObject instanceof Parent: "
				+ (childObject instanceof Parent));

		System.out.println("childObject instanceof Child: "
				+ (childObject instanceof Child));
		
		System.out.println("childObject instanceof Employee Interface: "
				+ (childObject instanceof Employee));


	}

}