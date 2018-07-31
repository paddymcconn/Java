package Data_Structures;

import java.util.*;

public class java_1D_Array
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		int toPrint[] = new int [n];
		
		for(int i =0; i<n; i++)
		{
			toPrint[i] = Sc.nextInt();
		}
		for(int i =0; i< toPrint.length; i++)
		{
			System.out.println(toPrint[i]);
		}
		Sc.close();
	}
}
