package Java.Strings;

import java.util.*;

public class Java_String_Tokens
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		String tokens = Sc.nextLine();
	
		countTheStringTokens(tokens);
		Sc.close();
	}
	public static String[] countTheStringTokens(String tokens)
	{
		String delims = "[ .,?!\\_'@]+";
		String[] token = tokens.trim().split(delims);
		if(tokens =="" || tokens.trim().equals(""))
		{
			System.out.print("0");
			return null;
		}
		else if(tokens.length()>= 400000)
		{
			return null;
		}
		else
		{
			System.out.println(token.length);
		}
		for(int i=0; i<token.length; i++)
		{
			System.out.println(token[i]);
		}
		return null;
	}
}
