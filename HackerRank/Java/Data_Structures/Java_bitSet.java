package Data_Structures;

import java.util.*;

public class Java_bitSet
{
	public static void main (String args[])
	{	
		Scanner Sc = new Scanner(System.in);
		int bitSetSize = Sc.nextInt();
		
		BitSet b1 = new BitSet(bitSetSize);
		BitSet b2 = new BitSet(bitSetSize);
		
		int operations = Sc.nextInt();
		String s = null;
		int i, j;
		
		while(operations > 0)
		{
			s = Sc.next();
			i = Sc.nextInt();
			j = Sc.nextInt();
			
			switch(s)
			{
			case("AND") : if(i == 1)
				{
					b1.and(b2);
				}
				else
				{
					b2.and(b1);
				}
			break;
			case("OR") : if(i == 1)
				{
					b1.or(b2);
				}
				else
				{
					b2.or(b1);
				}
			break;
			case("XOR") : if(i == 1)
				{
					b1.xor(b2);
				}
				else
				{
					b2.xor(b1);
				}
			break;
			case("FLIP") : if(i == 1)
				{
					b1.flip(j);
				}
				else
				{
					b2.flip(j);
				}
			break;
			case("SET") : if(i == 1)
				{
					b1.set(j);
				}
				else
				{
					b2.set(j);
				}
			break;
			default : ;
			}
			System.out.println(b1.cardinality()+" "+b2.cardinality());
			operations --;
		}
		Sc.close();
	}
}
