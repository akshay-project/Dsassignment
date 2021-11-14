
public class DemoQuickSort 
{

	public static void main(String[] args) 
	{
		Sort qs=new Sort();
		int[] arr = {23,5,9,12,21,34,32,17,5,3,8,7,20};
		System.out.println("Before Sorting Elements are:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		qs.quickSort(arr, 0, arr.length-1);
		System.out.println("After Sorting Elements are:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
