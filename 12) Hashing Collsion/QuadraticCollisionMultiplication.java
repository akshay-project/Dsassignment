import java.util.Scanner;

public class QuadraticCollisionMultiplication 
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
		int attempt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the five numbers to store in Array by Hashing");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Input "+i+" th Number");
			num = sc.nextInt();
			hashcode=multiplicationHash(num, arr);
			// Quadratic Collision
			attempt=1;
			while(arr[hashcode]!=0 && hashcode<arr.length)
			{
				hashcode=hashcode+attempt*attempt;
				attempt++;
			}	
			if (arr[hashcode]==0)
				  arr[hashcode] = num;
		}	
		// Print Elements
		System.out.println("Array is as follows");
		for (int i=0;i<arr.length;i++)
			System.out.println("arr[" + i + "] = " + arr[i]);
		
		// Search Element
		System.out.println("Enter the Element to search");
		int el = sc.nextInt();
		System.out.println("Search for the element " + el);
		int idx = multiplicationHash(el, arr);
		attempt=0;
		while(attempt<=10 && (idx+attempt*attempt)<arr.length)
			{	
			if (arr[idx+attempt*attempt] == el)
			 {
				System.out.println("Element found at index " + (idx+attempt*attempt));
				return;
			 }
//			System.out.println(idx+attempt*attempt);
			attempt++;
			}

			System.out.println("Element not found.");
	}

}