package Data_Structures;

import java.util.*;

public class Java_Stack
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		while(Sc.hasNext())
		{
			String isBalanced = Sc.next();
			System.out.println(balanced_Stack(isBalanced));	
		}
		Sc.close();
	}
	
	public static boolean balanced_Stack(String s)
	{
	       Stack<Character> stack = new Stack<Character>();
	       for (int i = 0; i < s.length(); i++)
	       {
	           if (s.charAt(i) == '(')
	           {
	               stack.push('(');
	           }
	           else if (s.charAt(i) == '{')
	           {
	               stack.push('{');
	           }
	           else if (s.charAt(i) == '[')
	           {
	        	   stack.push('[');
	           }
	           else if (s.charAt(i) == ')')
	           {
	               if (stack.isEmpty())
	               {
	            	   return false;
	               }
	               if (stack.pop() != '(')
	               {
	            	   return false;
	               }
	           }
	           else if (s.charAt(i) == '}')
	           {
	               if (stack.isEmpty())
	               {
	            	   return false;
	               }
	               if (stack.pop() != '{')
	               {
	            	   return false;
	               }
	           }
	           else if (s.charAt(i) == ']')
	           {
	               if (stack.isEmpty())
	               {
	            	   return false;   
            	   }
	               if (stack.pop() != '[')
	               {
	            	   return false;   
            	   }
	           }
	       }
	       return stack.isEmpty();
	   }
	public static boolean balanced (String parenthesis)
	{
		parenthesis = parenthesis.replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
		if(parenthesis.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
