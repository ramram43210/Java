interface Person
{
	/*
	 * By default variable declared in interface is  public static final
	 * (i.e. constant)
	 */
	int numberOflegs = 2;
	/*
	 * Method signatures have no braces and are terminated 
	 * with a semicolon.
	 * 
	 * By default method declared in interface is public abstract.
	 * 
	 */
	void walk();
}
