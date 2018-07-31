package Exception_Handling;
import java.util.*;


public class Java_Try_Catch
{
	public static void main(String[] args)
    {
		try
		{
			Scanner Sc = new Scanner(System.in);
			int x = Sc.nextInt();
			int y = Sc.nextInt();
			Sc.close();
			if(y==0)
			{
				throw  new ArithmeticException("/ by zero");
            }
            else
            {
            	System.out.println(x/y);
            }
        }
		catch(InputMismatchException e)
        {
			System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e)
        {
        	System.out.println(e);
        }
    }
}
