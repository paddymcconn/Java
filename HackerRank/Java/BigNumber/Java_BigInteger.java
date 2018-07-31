package BigNumber;

import java.math.BigInteger;
import java.util.*;

public class Java_BigInteger 
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		BigInteger a = Sc.nextBigInteger();
		BigInteger b = Sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		Sc.close();
		
	}
}
