package Java.Strings;

import java.util.*;

public class Java_Substring
{	
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        S = S.substring(start,end);
        System.out.println(S);
    }
}