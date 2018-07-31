package Advanced;

import java.security.Permission;
import java.util.Scanner;

interface Food
{
	public String getType();
}
	class Pizza implements Food
	{
		public String getType()
		{
			return "Someone ordered a Fast Food!";
		}
	}
	class Cake implements Food
	{
		public String getType()
		{
			return "Someone ordered a Dessert!";
		}
	}
	class FoodFactory
	{
		public Food getFood(String order)
		{
			switch(order)
			{
			case "pizza" : return new Pizza();
			case "cake" : return new Cake();
			default : return null;
			}
		}
	}

public class Java_Factory_Pattern
{
	public static void main (String args[])
	{
		Do_Not_Terminate.forbidExit();
		
		try {
			Scanner Sc = new Scanner(System.in);
			FoodFactory foodFactory = new FoodFactory();
			// create an instance of food factory.
			Food food = foodFactory.getFood(Sc.nextLine());
			// fill in its food arg with next line.
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e)
		{
			System.out.println("Unsuccessful Termination !!");
		}
	}
}
class Do_Not_Terminate
{
	public static class ExitTrappedException extends SecurityException
	{
		private static final long serialVersionID = 1L;
	}
	
	public static void forbidExit()
	{
		final SecurityManager securityManager = new SecurityManager()
		{
		@Override
		public void checkPermission (Permission permission)
		{
			if(permission.getName().contains("exitVM"))
			{
				throw new ExitTrappedException();
			}
		}
		};
		System.setSecurityManager(securityManager);
	}
}
