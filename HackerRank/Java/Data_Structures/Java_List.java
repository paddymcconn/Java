package Data_Structures;

import java.util.*;

public class Java_List
{
	public static void main (String args[])
	{
		List <Integer> NumbersList = new ArrayList<Integer>();
		Scanner Sc = new Scanner (System.in);
		int N = Sc.nextInt(); // number of elements
		for(int i =0; i<N; i++)
		{
			NumbersList.add(Sc.nextInt());
		}
		// fill the list with the numbers
		int Q = Sc.nextInt();
		
		for(int i =0; i<Q; i++)
		{
			String Operation = Sc.next();
			if(Operation.equals("Insert"))
			{
				int x = Sc.nextInt();
				int y = Sc.nextInt();
				NumbersList = (InsertOperations(NumbersList,x,y));
			}
			else
			{
				int toDelete =Sc.nextInt();
				NumbersList = (DeleteOperations(NumbersList,toDelete));
			}
		}
		for (int element : NumbersList)
		{
		    System.out.print(element+" ");
		}
		Sc.close();
	}
	public static List<Integer> DeleteOperations(List <Integer> numbersList, int deleteIndex)
	{
		numbersList.remove(deleteIndex);
		return numbersList;
	}
	public static List <Integer> InsertOperations(List <Integer> numbersList, int x, int y)
	{
		numbersList.add(x, y);
		return numbersList;
	}
}
