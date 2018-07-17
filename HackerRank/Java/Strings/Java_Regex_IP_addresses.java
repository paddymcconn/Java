package Java.Strings;

import java.util.*;
public class Java_Regex_IP_addresses
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        while(Sc.hasNext())
        {
            String IP = Sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        Sc.close();
    }
}
class MyRegex
{
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}