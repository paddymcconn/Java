package Java.Strings;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Tag_Content_Extractor
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner (System.in);
		int testCases = Integer.parseInt(Sc.nextLine());
		while(testCases-- >0)
		{
			String line = Sc.nextLine();
			 boolean matchFound = false;
	         Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
	         Matcher m = r.matcher(line);

	         while (m.find())
	         {
	        	 System.out.println(m.group(2));
	             matchFound = true;
	         }
	         if(! matchFound)
	         {
	        	 System.out.println("None");
	         }
		}
		Sc.close();
	}
}
