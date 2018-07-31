package BigNumber;


import java.math.BigInteger;
import java.util.*;
public class Java_Primality_Test
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		BigInteger certantity = new BigInteger(Sc.nextLine());
		boolean isprime = certantity.isProbablePrime(1);
		if(isprime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		Sc.close();
	}
}
