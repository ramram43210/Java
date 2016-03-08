/*
 * public String toUpperCase()
 *  * 
 * Returns: 
 * ------- * 
 * the String, converted to uppercase.
 * 
 * ===========================================
 * 
 * public String toUpperCase(Locale locale)
 *  
 * Parameters: 
 * ---------- 
 * locale - use the case transformation rules for
 * this locale.
 * 
 * Returns: 
 * ------- 
 * the String, converted to uppercase.
 */
import java.util.Locale;

public class ToUpperCaseDemo
{

	public static void main(String[] args)
	{
		String str1 = "welcome";
		String strUpper1 = str1.toUpperCase();
		System.out.println("strUpper1 = " + strUpper1);

		String str2 = "hello";
		String strUpper2 = str2.toUpperCase(Locale.ITALIAN);
		System.out.println("strUpper2 = " + strUpper2);
	}
}
