package Java.Introduction;

import java.util.*;
public class Java_Int_To_String
{
	public static void main(String[] args)
	{
		try {
			Scanner in = new Scanner(System.in);
			int n = in .nextInt();
			in.close();
			String s = Integer.toString(n);
			
			if(n == Integer.parseInt(s))
			{
				System.out.println("parsed the integer to string.");
			}
			else
			{
				System.out.println("Not successful in parsing the integer to string.");
			}
		}
		catch (Exception e){
			System.out.println("Not handled");
		}
		
	}
}
   //String s=???; Complete this line below