
public class ArrayMethods1 {

	public static void insertionSort(int[] list1)
	{
		
	}
	
	public static void selectionSort(double[] list1)
	{
		
	}
	
	public static void bubbleSort(String[] list1)
	{
		for(int x = 0;  x < list1.length; x++)
		{
			String a = list1[x];
			String b = list1[x+1];
			if()
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

	public static void swapInt(int[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	public static void swapString(String[] arr, int index1, int index2)
	{
		int x = index1;
		String a = arr[x];
		arr[index1] = arr[index2];
		arr[index2] = a;
	}
	
	public static void swapDouble(double[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
}
