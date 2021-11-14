package com.cdac;

public class ShellSortImplementation {
	public void shellSort(int[] arr)
	{
		int i,shells;
		int[] increment = new int[20];
		for (i=0,shells=1;shells<arr.length;i++)
		{
			increment[i] = shells;
			shells = 2 * shells + 1;
 		}
		System.out.println("i = " + i);
		i--;
		System.out.println("Shells are as follows:");
		for(int k=i;k>=0;k--)
		{
			System.out.println(increment[k]);
		}	
	}
	
	public static void main(String[] args)
	{
		ShellSortImplementation ssi = new ShellSortImplementation();
		int[] arr = {23,5,9,12,21,34,32,17,5,3,8,7,20,10,15};
		ssi.shellSort(arr);
	}
}
