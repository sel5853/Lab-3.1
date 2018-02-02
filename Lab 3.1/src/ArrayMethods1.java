import java.util.Arrays;

/*
 * Author: Stanley Liang
 * Date: 2/1/18
 * Lab 3.1 Sorting Algorithms
 */

public class ArrayMethods1 {

	//Used video for help in understanding insertion sort: https://www.youtube.com/watch?v=lCDZ0IprFw4
	
	public static void insertionSort(int[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)			//Goes through the array to compare each number to all of the numbers preceding it
		{
			for(int y = x + 1; y > 0; y--)					//Will keep swapping a number until it reaches a preceding number smaller than itself
			{
				int a = list1[y];
				int b = list1[y-1];
				if(a < b)									//If value is less than value preceding it, they will swap
				{
					swapInt(list1, y, y-1);
				}
			}
		}
	}
	
	//Used video for help in understanding selection sort: https://www.youtube.com/watch?v=cqh8nQwuKNE
	
	public static void selectionSort(double[] list1)
	{
		for(int x = 0;  x < list1.length; x++)				//Goes through the array to find the first value
		{
			int low = x;									//Creates an integer to find the location of the lowest number in the array
			for(int y = x; y < list1.length - 1; y++)		//Goes through the array to find values coming after the first value to compare
			{
				double a = list1[x];
				double b = list1[x+1];
				if(a < b)									//Sets the lowest number to list1[x] if it is lower than the previous lowest number
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
			for(int x = 0;  x < list1.length - 1; x++)		//Goes through the array in order
			{
				String a = list1[x];
				String b = list1[x+1];
				if(a.compareTo(b) > 0)						//Compares two strings to see which one comes first alphabetically
				{
					swapString(list1, x, x+1);				
					swap++;									//Integer swap will increase after a swap
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

	//An integer is used since the insertion sort for this lab is testing integers
	public static void swapInt(int[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	//A string is used since the bubble sort for this lab is testing strings
	public static void swapString(String[] arr, int index1, int index2)
	{
		String x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	//A double is used since the selection sort for this lab is testing doubles
	public static void swapDouble(double[] arr, int index1, int index2)
	{
		double x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
}
