package Data_Structures;

import java.util.*;

public class java_Subarray
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
	    int c = Sc.nextInt();
	    int [] arr = new int[c];
	    // holding the number of numbers
	    int maxCount = 0;
	    // simple counter
	    
	    for(int i=0 ; i<c ; i++)
	    {
	        arr[i]=Sc.nextInt();
	        int sum = 0;
	        for(int j = i ; j>=0 ; j--){
	            sum+=arr[j];
	            if(sum<0)
	            {
	                maxCount++;
	                //System.out.println(i+":"+j);
	            }
	        }
	    }
	    System.out.println(maxCount);
	    Sc.close();
	}
}

