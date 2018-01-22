
public class ArrayMethods1 {

	public static void insertionSort(int[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)
		{
			int low = 0;
			int a = list1[x];
			int b = list1[x+1];
			if(a < b)
			{
				swapInt(list1[x], a, b);
			}
		}
	}
	
	public static void selectionSort(double[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)
		{
			double a = list1[x];
			double b = list1[x+1];
			if(a < b)
			{
				swapDouble(list1[x], a, b);
			}
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)
		{
			String a = list1[x];
			String b = list1[x+1];
			if(a.compareTo(b) > 0)
			{
				swapString(list1[x], a, b);
			}
		}
	}
	
	private static void swapString(String x, String a, String b)
	{
		
	}
	
	private static void swapInt(int x, int a, int b)
	{
		
	}
	
	private static void swapDouble(double x, double a, double b)
	{
		
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
