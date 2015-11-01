public class ClassLiteralDemo
{

	public static void main(String[] args)
	{

		try
		{
			Class<?> stringClassObject = Class.forName("java.lang.String");
			System.out.println("Get stringClassObject using 'Class.forName' method: "
					+ stringClassObject);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		Class<?> stringClassObject = java.lang.String.class;

		System.out.println("Get stringClassObject using 'class Literal' : "
				+ stringClassObject);

		Class<?> longClassObject = java.lang.Long.class;

		System.out.println("Get longClassObject using 'class Literal'   : "
				+ longClassObject);

	}
}
