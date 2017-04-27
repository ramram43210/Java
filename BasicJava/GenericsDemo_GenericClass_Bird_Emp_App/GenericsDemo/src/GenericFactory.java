/*
 * It is possible to generify your own Java classes. Generics is not
 * restricted to the predefined classes in the Java API's.
 * 
 * The <T> is a type token that signals that this class can have a type set
 * when instantiated.
 */
public class GenericFactory<T>
{
	
	Class<?> theClass = null;

	public GenericFactory(Class<?> theClass)
	{
		this.theClass = theClass;
	}

	public T createInstance()
			throws IllegalAccessException, InstantiationException
	{
		return (T) this.theClass.newInstance();
	}
}