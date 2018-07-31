package Data_Structures;

import java.util.*;

public class Java_Map
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int entries = Sc.nextInt();
		Sc.nextLine();
		Map <String, Integer> mp = new HashMap <String, Integer> ();
		for(int i =0; i<entries; i++)
		{
			String name = Sc.nextLine();
			int phone = Sc.nextInt();
			mp.put(name,phone);
			Sc.nextLine();
		}
		for(int j =0; j<entries; j++)
		{
			String name = Sc.nextLine();
			if(mp.containsKey(name))
			{
				System.out.println(name + "=" + mp.get(name));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
}
