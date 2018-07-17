package Java.Introduction;

import java.util.*;

public class Java_Date_And_Time
{
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return <String> as the day of the week.
	 */
	public static String getDay(String day, String month, String year)
	{
	    int year_int = Integer.parseInt(year);
	    if(year_int>2000 && year_int<3000)
	    {
	        Calendar cal = Calendar.getInstance();
	        cal.set(Integer.valueOf(year), (Integer.valueOf(month) - 1), Integer.valueOf(day));
	        
	        return cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.getDefault()).toUpperCase();
	    }
	    else
	    {
	         return "Not a day.";
	    }
	}
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		String month = Sc.next();
		String day = Sc.next();
		String year = Sc.next();
		Sc.close();
		System.out.println(getDay(day,month,year));
	}
}
