
public class StackClass {
	private char[] arr;
	private int top;
	public StackClass()
	{
		arr = new char[5];
		top = -1;
	}
	public StackClass(int size)
	{
		arr = new char[size];
		top = -1;
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == arr.length-1);
	}
	public void push(char element)
	{
		if (!isFull())
		{
			arr[++top] = element;
		}
		else
		{
			System.out.println("Stack is already full.");
		}
	}
	public int pop()
	{
		if (!isEmpty())
		{
			return arr[top--];
		}
		else
		{
			System.out.println("Empty stack.");
			return -1;
		}
	}

	public int peek()
	{
		if (!isEmpty())
		{
			
			return arr[top];
		}
		else
		{
			System.out.println("Empty stack.");
			return -1;
		}
	}
}

