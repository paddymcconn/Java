package Data_Structures;

import java.util.*;

public class java_2D_Array
{
	public static void main (String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int arr [][] = new int [6][6];
		
		for(int i =0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				arr[i][j] = Sc.nextInt();
			}
		}
		// fill the array
		Sc.close();
		System.out.println(Hourglass(arr));
	}
	// find max sum
	public static int Hourglass (int rAndc [][])
	{
		int max = Integer.MIN_VALUE;
		for(int row =0; row<4; row++)
		{
			for(int col =0; col<4; col++)
			{
				int sum = findSum(rAndc,row,col);
				max = Math.max(max, sum);
			}
		}
		return max;
	}
	public static int findSum (int arr [][], int row, int col)
	{
		int sum = arr[row + 0][col + 0] + arr[row + 0][col + 1] + arr[row + 0][col + 2] +
										  arr[row + 1][col + 1] +
				  arr[row + 2][col + 0] + arr[row + 2][col + 1] + arr[row + 2][col + 2]; 
				// its an hourglass shape :)
		return sum;
	}
}
