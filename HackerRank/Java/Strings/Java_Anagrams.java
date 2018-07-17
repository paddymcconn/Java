package Java.Strings;

import java.util.*;
public class Java_Anagrams
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		String a = Sc.next();
		String b = Sc.next();
		Sc.close();
		boolean bool2 = isAnagram2(a,b);
		//boolean bool = isAnagram(a,b);
		if(bool2)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
	}
	public static boolean isAnagram(String a, String b)
	{
		if(a ==null || b == null || a.equals("") || b.equals(""))
		{
			throw new IllegalArgumentException();
		}
		if(a.length()!= b.length())
		{
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		Map<Character,Integer> anagramMap = new HashMap<Character,Integer>();
		
		for(int i=0; i<b.length(); i++)
		{
			char letter = b.charAt(i);
			
			if(!anagramMap.containsKey(letter))
			{
				anagramMap.put(letter, 1);
			}
			else
			{
				Integer freq = anagramMap.get(letter);
				anagramMap.put(letter, ++freq);
			}
		}
		
		for (int k = 0; k < a.length(); k++)
		{
		    char letter = a.charAt(k);
		    
		    if(!anagramMap.containsKey(letter))
		    {
		    	return false;
		    }
		    Integer freq = anagramMap.get(letter);

		     if(freq == 0)
		     {
		    	 return false;
		     }
		    else    
		    {

		    	anagramMap.put( letter, --freq);
		    }
		}
		return true;
	}
	public static boolean isAnagram2(String a, String b) {

        //initial check
        if (a.length() != b.length())
        {
        	return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char Aarr[] = new char[26];
        char Barr[] = new char[26];
        
        for(int i=0 ; i<a.length() ; i++)
        {
        	Aarr[a.charAt(i)-97]++;
        	Barr[b.charAt(i)-97]++;
        }
        return Arrays.equals(Aarr, Barr);
    }
}
