package Java.Strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Java_Substring_Comparisons
{
	
	/**
	 * get the lexically smallest and largest substring of size k.
	 * @param s
	 * @param k
	 */
    public static void getSmallestAndLargest(String s,int k)
    {
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++)
        {
            sets.add(s.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }
    
    public static void main (String args[])
    {
    	Scanner Sc = new Scanner(System.in);
    	String s = Sc.next();
    	int k = Sc.nextInt();
    	Sc.close();
    	
    	getSmallestAndLargest(s,k);
    }
}
