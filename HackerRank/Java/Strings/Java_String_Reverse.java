package Java.Strings;

import java.util.*;

public class Java_String_Reverse
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Method 1: Stringbuilder"); 
		String isPal = Sc.next();
		// method 1 - use of java stringbuilder methods
		System.out.println(isPal.equalsIgnoreCase(new StringBuilder(isPal).reverse().toString()) ? "yes" : "no");
		
		// method 2 - good old left-right comparisons with recursion
		System.out.println("Method 2: Recursion"); 
		String A=Sc.next();        
	    String result = isPalindrome(A, 0, A.length()-1);        
	    System.out.println(result);        
		Sc.close();
	}
	public static String isPalindrome(String word, int first, int last){       

	    if (word == null || "".equals(word))
	       return "The string is null or empty.";     

	    return isPalindRecursive(word.toLowerCase(), first, last);
	}    


	private static String isPalindRecursive(String word, int first, int last){                

	    if (first >= last)
	        return "Yes";              

	    if (word.charAt(first) != word.charAt(last))
	        return "No";

	    return isPalindRecursive(word, ++first, --last); 
	}
}
