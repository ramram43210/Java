public class GenericDemo
{
	public static void main(String[] args)
			throws IllegalAccessException, InstantiationException
	{

		Bird bird = getInstance(Bird.class);
		System.out.println(bird);

		Employee employee = getInstance(Employee.class);
		System.out.println(employee);

	}

	/*
	 * Class objects can be used as type specifications too, at runtime.
	 */
	public static <T> T getInstance(Class<T> theClass)
			throws IllegalAccessException, InstantiationException
	{

		return theClass.newInstance();
	}
}