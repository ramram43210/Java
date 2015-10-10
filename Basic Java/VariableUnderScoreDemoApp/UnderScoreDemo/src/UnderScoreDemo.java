public class UnderScoreDemo
{

	public static void main(String[] args)
	{

		long creditCardNumber = 1234_5678_9012_3456L;

		System.out.println("creditCardNumber : " + creditCardNumber);

		long socialSecurityNumber = 999_99_9999L;

		System.out.println("socialSecurityNumber : " + socialSecurityNumber);

		float pi = 3.14_15F;

		System.out.println("pi : " + pi);

		long hexBytes = 0xFF_EC_DE_5E;

		System.out.println("hexBytes : " + hexBytes);

		long hexWords = 0xCAFE_BABE;

		System.out.println("hexWords : " + hexWords);

		long maxLong = 0x7fff_ffff_ffff_ffffL;

		System.out.println("maxLong : " + maxLong);

		byte nybbles = 0b0010_0101;

		System.out.println("nybbles : " + nybbles);

		long bytes = 0b11010010_01101001_10010100_10010010;

		System.out.println("bytes : " + bytes);

	}
}
