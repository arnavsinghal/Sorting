import java.util.Scanner;

public class NewSort {

	static int n;// n is size of array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter value of n: ");
		n = sc.nextInt();
		int[] array = new int[n];// array will be allocated runtime memory
		System.out.print("Please enter n elements with space in between: ");
		for (int i = 0; i<n; i++) array[i] = sc.nextInt();
		for (int i = 0; i<n-1; i++)
		{
			for (int j = 1+i; j<n; j++)
			{
				if (array[i] > array[j])
				{
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.print("sorted array is: ");
		for (int i = 0; i<n; i++) System.out.print(array[i] + " ");



	}

}

