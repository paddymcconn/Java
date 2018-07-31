package BigNumber;

import java.math.BigDecimal;
import java.util.*;

public class Java_BigDecimal
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
      	sc.close();
	
        String newArray[] = new String[n];
        for(int i= 0;i < newArray.length; i++)
        {
            newArray[i] = s[i];
        }

        Arrays.sort(newArray, Collections.reverseOrder(new Comparator<String>()
        {
        	public int compare(String a1, String a2)
        	{
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));

        s = newArray;
        
    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
}

}
