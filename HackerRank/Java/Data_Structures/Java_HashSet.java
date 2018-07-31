package Data_Structures;

import java.util.*;

public class Java_HashSet
{
	public static void main(String[] args)
	{
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++)
        {
            pair_left[i] = Sc.next();
            pair_right[i] = Sc.next();
        }
        
        HashSet<String> pairs = new HashSet<String>(t);

        for(int i = 0; i < t; i++)
        {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
            System.out.println(pairs.size());
        } 
        Sc.close();
    }
}