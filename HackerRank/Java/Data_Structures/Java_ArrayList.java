package Data_Structures;

import java.util.*;

/**
 * 
 * @author Patrick
 * This is a HackerRank Question.
 * The objective is to get n lists of numbers of varying length and see of some index exists.
 */
public class Java_ArrayList 
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		ArrayList <ArrayList<Integer>> Lists = new ArrayList <ArrayList<Integer>>();
		int d,q,x,y;
		for(int i =0; i<n; i++)
		{
			d = Sc.nextInt();
			ArrayList<Integer> List = new ArrayList<Integer>();
			// an arraylist of arraylists
			for(int j =0; j<d; j++)
			{
				List.add(Sc.nextInt());
				// adding the specific elements to the arraylist 
			}
			Lists.add(List);
		}
		q = Sc.nextInt();
		for (int i = 0; i < q; i++)
		{
            x = Sc.nextInt();
            y = Sc.nextInt();
            ArrayList<Integer> List = Lists.get(x-1);
            
            if (y <= List.size())
            {
                System.out.println(List.get(y-1));
            }
            else
            {
                System.out.println("ERROR!");
            }
        }
			Sc.close();
	}
}
