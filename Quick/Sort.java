
public class Sort 
{
	public int partition(int[] arr, int lb,int ub )
	{
		int pivot= arr[lb];
		int start = lb;
		int end = ub;
		while(start<end)
		{
			while(arr[start]<=pivot)
			{
				start++;
			}
			
			while(arr[end]>pivot)
			{
				end--;
			}
			
			if(start<end)
			{
				//swap arr[start] and arr[end]
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		//swap arr[lb] and arr[end]
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}
	
	public void quickSort(int[] arr, int lb, int ub)
	{
		int loc;
		if(lb<ub)
		{
			loc= partition(arr, lb,ub);
			quickSort(arr,lb,loc-1);
			quickSort(arr, loc+1, ub);
			
		}
	}
	
}
