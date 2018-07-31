package Advanced;
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class Java_MD5
{
    public static void main(String[] args)
    {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            Scanner sc = new Scanner(System.in);
            md.update(sc.next().getBytes());
            byte[] bytes = md.digest();
            System.out.println(DatatypeConverter.printHexBinary(bytes).toLowerCase());
        }
        catch(Exception e) {}
    }
}