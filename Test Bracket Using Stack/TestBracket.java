import java.util.Scanner;
public class TestBracket 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the Bracket String");
		String s= sc.next();
		
		if(s.length()%2!=0)
		{
			System.out.println("Brackets are Not Matched");
			System.exit(0);
		}	
		StackClass bs = new StackClass(s.length());
		
		for (int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)==']' || s.charAt(i)=='}' || s.charAt(i)== ')')
			{
				bs.push(s.charAt(i));
			}
			
			else
			{
				System.out.println("You input  non bracket char");
				System.exit(0);
			}
		}
		
		char c1, c2;
		
		for (int i=0, j= s.length()-1; i<s.length()/2; i++, j--)
		{
			c1= s.charAt(i);
			c2=s.charAt(j);
			
			if(c1=='[' && c2==']' || c1=='{' && c2=='}' || c1== '(' && c2==')')
			{
				bs.pop();
			}
			
			else
			{
				System.out.println("Brackets are Not Matched");
				System.exit(0);
			}
			
		}
		System.out.println("Brackets are Matched");
		

	}

}
