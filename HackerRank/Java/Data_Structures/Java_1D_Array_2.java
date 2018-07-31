package Data_Structures;

import java.util.*;

public class Java_1D_Array_2
{
	public static boolean isSolvable(int m,int [] array, int i)
	{
	    /* Base Cases */
	    if (i < 0 || array[i] == 1)
	    {
	        return false;       
	    } 
	    // current index is not hoppable 
	    else if (i + 1 >= array.length || i + m >= array.length)
	    {
	        return true;
	    } 
	    // if we hop forward 1 or leap amount and are on the end, accept
	        
	    array[i] = 1;
	    // marks as visited

	    /* Recursive Cases */
	    return isSolvable(m,array, i + m) || 
	           isSolvable(m,array, i + 1) || 
	           isSolvable(m,array, i - 1);
	}
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        int q = Sc.nextInt();
        while (q-- > 0)
        {
            int n = Sc.nextInt();
            int leap = Sc.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++)
            {
                game[i] = Sc.nextInt();
            }
            int i =0;
            System.out.println( (isSolvable(leap, game, i)) ? "YES" : "NO" );
        }
        Sc.close();
    }
}