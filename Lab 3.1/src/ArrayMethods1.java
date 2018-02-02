import java.util.Arrays;

/*
 * Author: Stanley Liang
 * Date: 2/1/18
 * Lab 3.1 Sorting Algorithms
 */

public class ArrayMethods1 {

	public static void insertionSort(int[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)
		{
			int a = list1[x];
			int b = list1[x+1];
			if(a < b)
			{
				swapInt(list1, x, x+1);
			}
		}
	}
	
	//Used video for help in understanding selection sort: https://www.youtube.com/watch?v=cqh8nQwuKNE
	public static void selectionSort(double[] list1)
	{
		for(int x = 0;  x < list1.length; x++)
		{
			int low = x;
			for(int y = x; y < list1.length - 1; y++)
			{
				double a = list1[x];
				double b = list1[x+1];
				if(a < b)
				{
					low = x;
				}
			}
			swapDouble(list1, low, x);
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		int swap = 1;										//Swap is set to 1 to get the loop started
		while(swap > 0)
		{
			swap = 0;										//Swap is set to 0 to make sure loop stops when it should
			for(int x = 0;  x < list1.length - 1; x++)		//Goes through the array
			{
				String a = list1[x];
				String b = list1[x+1];
				if(a.compareTo(b) > 0)						//Compares two strings to see which one comes first alphabetically
				{
					swapString(list1, x, x+1);				//Performs the swap
					swap++;									//Number of swaps will increase 
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		//Testing Arrays
		int[] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));
	}

	public static void swapInt(int[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	public static void swapString(String[] arr, int index1, int index2)
	{
		String x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	public static void swapDouble(double[] arr, int index1, int index2)
	{
		double x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
}
