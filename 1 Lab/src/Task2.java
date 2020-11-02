import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("¬ведите begin: ");
		int begin = in.nextInt();
		System.out.print("¬ведите end: ");
		int end = in.nextInt();
		System.out.print("¬ведите step: ");
		int step = in.nextInt();
		in.close();
		
		if(begin >= end || step > (end - begin)) 
		{
			System.out.println("ќшибка. »змените начальные данные.");
		}
		else 
		{
		    fillArray(begin,end,step);
		}
	}
	
	private static int[] fillArray(int begin, int end, int step)
	{
		int size = end + 1 ;
		
		int[] arr = new int [size];
		
		for(int i = begin; i <= size; i+=step)
		{
			 arr[i] = + i;
		}
		
		for(int i = begin; i <= size; i+=step)
		{
			System.out.print(arr[i] + " ");
		}
		
		return arr;
	}
}