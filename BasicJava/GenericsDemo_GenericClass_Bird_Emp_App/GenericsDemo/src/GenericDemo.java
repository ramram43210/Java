public class GenericDemo
{
	public static void main(String[] args)
			throws IllegalAccessException, InstantiationException
	{

		/*
		 * It is not necessary to cast the object returned from the
		 * factory.createInstance() method. The compiler can deduct the type of
		 * the object from the generic type of the GenericFactory created,
		 * because you specified the type inside the <>.
		 */
		GenericFactory<Employee> empFactory = new GenericFactory<Employee>(Employee.class);
		Employee employee = empFactory.createInstance();
		System.out.println(employee);

		GenericFactory<Bird> birdFactory = new GenericFactory<Bird>(Bird.class);
		Bird bird = birdFactory.createInstance();
		System.out.println(bird);
	}

}