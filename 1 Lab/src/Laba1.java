import java.util.Scanner;

public class Laba1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите число строк и столбцов: ");
		int n = in.nextInt();
		if(n == 0 || n == 1)
		{
			System.out.println("Ошбика создания массива.");
		}
		else 
		{
			//System.out.println("Введите число столбцов: ");
			//int c = in.nextInt();
			
			int[][] arr = new int[n][n];
			
			in.close();
			
			for(int i = 0; i<arr.length; i++)
			{
				for(int j = 0; j<arr[i].length; j++)
				{
					arr[i][j]=(int)(Math.random()*10);
				}
			}
			
			System.out.println("Наша матрица:");
			printArray(arr);
			
			System.out.println("Четные числа:");
			
			int[] arr2 = new int[n];
			for(int i = 0; i<arr.length; i++)
			{
				for(int j = 0; j<arr[i].length; j++)
				{
					 if (i + j == arr.length - 1) 
					 {
						 if (arr[i][j]%2 == 0)
						 {
						    arr2[i] = arr[i][j];
						    System.out.print(arr2[i]+" ");
						 }
					 }
				}
			}
		}
	}
	
	private static void printArray(int arr[][])
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}