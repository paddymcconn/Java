package Java.Introduction;

import java.util.*;
public class Java_EOF
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		for(int i= 1;Sc.hasNext() ==true; i++)
		{
			System.out.println(i+" "+Sc.nextLine());
		}
	}
}
