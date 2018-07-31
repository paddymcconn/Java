package Data_Structures;

import java.util.*;

public class Java_Dequeue
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        
        int n = Sc.nextInt();
        int m = Sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            int input = Sc.nextInt();
            
            deque.add(input);
            set.add(input);
            
            if (deque.size() == m)
            	// every time the length is the subarray length
            {
                if (set.size() > max)
            	{
                	max = set.size();
            	}
                
            int first = deque.remove();
                if (!deque.contains(first))
            	{
                	set.remove(first);
                }
            }
        }
        Sc.close();
        System.out.println(max);
    }
}
