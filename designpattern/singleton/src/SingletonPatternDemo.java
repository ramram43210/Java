public class SingletonPatternDemo
{
	public static void main(String[] args)
	{
		Singleton.getSingletonInstance().printSingleton();
		Singleton.getSingletonInstance().printSingleton();
		Singleton.getSingletonInstance().printSingleton();
	}

}
