
import java.util.Scanner;
public class LinearCollisionMultiplication 
{
	public static int multiplicationHash(int element, int[] arr)
	{
		double c = 0.583165;
		double mult= c*element;
		int intpart= (int)mult;
		double decimalVal= mult-intpart;
		double frac= decimalVal*arr.length;
		System.out.println("Int Part"+ (Math.floor(frac)));
		return (int)(Math.floor(frac));
		
	}

	public static void main(String[] args) 
	{
		int[] arr = new int[100];
		int hashcode;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the five numbers to store in Array by Hashing");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Input "+i+" th Number");
			num = sc.nextInt();
			hashcode=multiplicationHash(num, arr);
			// Linear Collision
			while(arr[hashcode]!=0 && hashcode!=arr.length)
			{
				hashcode=hashcode+1;
			}	
			if (arr[hashcode]==0)
				  arr[hashcode] = num;
		}	
		// Print Element
		System.out.println("Array is as follows");
		for (int i=0;i<arr.length;i++)
			System.out.println("arr[" + i + "] = " + arr[i]);
		
		// Search Element
		System.out.println("Enter the Element to search");
		int el = sc.nextInt();
		System.out.println("Search for the element " + el);
		int idx = multiplicationHash(el, arr);
		int i=0;
		while(i<=20 && (idx+i)<arr.length)
			{	
			if (arr[idx+i] == el)
			 {
				System.out.println("Element found at index " + (idx+i));
				return;
			 }
//			System.out.println(idx+i);
			i++;
			}

			System.out.println("Element not found.");
	}

}


