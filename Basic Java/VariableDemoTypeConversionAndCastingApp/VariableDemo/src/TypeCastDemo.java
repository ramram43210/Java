public class TypeCastDemo
{

	public static void main(String[] args)
	{
		double doubleVariable = 2898.9999;
		long longVariable = 199;
		int intVariable;

		/*
		 * Variable of larger capacity is be assigned to another variable of
		 * smaller capacity.
		 */
		intVariable = (int) longVariable;

		System.out.println("longVariable " + longVariable
				+ " converted to intVariable : " + intVariable);

		intVariable = (int) doubleVariable;

		System.out.println("doubleVariable " + doubleVariable
				+ " converted to intVariable : " + intVariable);

	}
}
